USE furama;

-- Task 23

DELIMITER //

CREATE PROCEDURE sp_1(IN id INT)

BEGIN

DELETE FROM khach_hang
WHERE id_khachhang = id;

END //

DELIMITER ;

CALL sp_1(4);

-- Task 24

DELIMITER //

CREATE PROCEDURE sp_2(INOUT idhd INT, IN idnv INT, IN idkh INT, IN iddv INT, IN nlhd DATE, IN nkt DATE, IN tdc INT)

BEGIN
SET idhd = idhd + 1; 
INSERT INTO hop_dong (id_nhanvien, id_khachhang, id_dichvu, ngaylam_hopdong, ngay_ketthuc, tien_datcoc)
VALUES (idnv, idkh, iddv, nlhd, nkt, tdc);
END //

DELIMITER ;

SET @idhd = ( SELECT MAX(id_hopdong) FROM hop_dong);

CALL sp_2(@idhd, 4, 7, 3, '2018-03-05', '2018-04-05', 1500000);

CALL sp_2(@idhd, 3, 8, 3, '2019-06-06', '2019-07-06', 1000000);

CALL sp_2(@idhd, 10, 6, 3, '2017-03-11', '2017-04-16', 1000000);



-- Task 25

SHOW TRIGGERS;

DROP TRIGGER tr_1;

CREATE TABLE hopdong_after_trigger (
    soluong_conlai INT
);


INSERT INTO hopdong_after_trigger (soluong_conlai)
SELECT COUNT(id_hopdong)
FROM hop_dong;

DELIMITER $$
CREATE TRIGGER tr_1 AFTER DELETE ON hop_dong FOR EACH ROW
BEGIN
	UPDATE hopdong_after_trigger
	SET soluong_conlai = soluong_conlai - 1;
END $$

DELIMITER ;

SET SQL_SAFE_UPDATES = 0;
DELETE FROM hop_dong 
WHERE id_hopdong = 8;
SET SQL_SAFE_UPDATES = 1;

SELECT * FROM hopdong_after_trigger;



-- Task 26

SHOW TRIGGERS;

DROP TRIGGER tr_2;

DELIMITER $$

CREATE TRIGGER tr_2 BEFORE UPDATE ON hop_dong FOR EACH ROW
BEGIN
	IF (datediff(new.ngay_ketthuc, old.ngaylam_hopdong)) < 2 THEN
    SIGNAL SQLSTATE '45000'
    SET MESSAGE_TEXT = 'Ngày kết thúc hợp đồng phải lớn hơn ngày làm hợp đồng ít nhất là 2 ngày';
	END IF;
END $$

DELIMITER ;

UPDATE hop_dong 
SET ngay_ketthuc = '2017-03-12'
WHERE id_hopdong = 8;


-- Task 27

DELIMITER $$

CREATE FUNCTION func_2(id INT)
RETURNS INT
READS SQL DATA

BEGIN
	DECLARE max_time INT;
	SET max_time = (SELECT MAX(datediff(ngay_ketthuc, ngaylam_hopdong)) FROM hop_dong
	WHERE id_khachhang = id
	GROUP BY id_khachhang);
	RETURN max_time;
END $$

DELIMITER ;

SELECT func_2(1);




