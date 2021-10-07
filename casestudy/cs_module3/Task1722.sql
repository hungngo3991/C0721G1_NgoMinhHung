USE furama;


-- Task 17

SET SQL_SAFE_UPDATES = 0;

UPDATE khach_hang SET id_loaikhach = 1
WHERE id_khachhang IN (SELECT id_khachhang FROM (SELECT kh.id_khachhang FROM khach_hang kh
JOIN loai_khach lk ON kh.id_loaikhach = lk.id_loaikhach
JOIN hop_dong hd ON kh.id_khachhang = hd.id_khachhang
JOIN dich_vu dv ON hd.id_dichvu = dv.id_dichvu
JOIN hopdong_chitiet hdct ON hd.id_hopdong = hdct.id_hopdong
JOIN dichvu_dikem dvdk ON hdct.id_dichvu_dikem = dvdk.id_dichvu_dikem
WHERE (lk.ten_loaikhach = 'Platinium') AND (YEAR(hd.ngaylam_hopdong) = 2019)
GROUP BY hd.id_khachhang
HAVING SUM(dv.chiphi_thue + dvdk.gia * dvdk.donvi) > 10000000) AS tongtien_thanhtoan);

SET SQL_SAFE_UPDATES = 1;


-- Task 18

SET SQL_SAFE_UPDATES = 0;
DELETE FROM khach_hang WHERE id_khachhang IN (SELECT id_khachhang FROM ( SELECT kh.id_khachhang
FROM khach_hang kh JOIN hop_dong hd ON kh.id_khachhang = hd.id_khachhang
WHERE YEAR(hd.ngaylam_hopdong) < 2016) AS namlam_hopdong);
SET SQL_SAFE_UPDATES = 1;

        

-- Task 19

SET SQL_SAFE_UPDATES = 0;
UPDATE dichvu_dikem
SET gia = gia * 2 WHERE id_dichvu_dikem IN (SELECT id_dichvu_dikem
FROM ( SELECT dvdk.id_dichvu_dikem FROM dichvu_dikem dvdk
JOIN hopdong_chitiet hdct ON dvdk.id_dichvu_dikem = hdct.id_dichvu_dikem
JOIN hop_dong hd ON hdct.id_hopdong = hd.id_hopdong
WHERE YEAR(hd.ngaylam_hopdong) = 2019
GROUP BY dvdk.id_dichvu_dikem
HAVING COUNT(hdct.id_dichvu_dikem) > 10) AS solan_sudung);
SET SQL_SAFE_UPDATES = 1;


-- Task 20

SELECT id_nhanvien AS id, hoten_nhanvien AS ho_ten, email, sdt, ngay_sinh, dia_chi
FROM nhan_vien 
UNION ALL
SELECT id_khachhang AS id, hoten_khachhang AS ho_ten, email, sdt, ngay_sinh, dia_chi
FROM khach_hang;
    

-- Task 21
CREATE VIEW v_nhanvien AS
SELECT nv.*
FROM nhan_vien nv JOIN hop_dong hd ON nv.id_nhanvien = hd.id_nhanvien
WHERE nv.dia_chi = 'Hải Châu' AND hd.ngaylam_hopdong = '2019-12-12';


-- Task 22
UPDATE v_nhanvien 
SET dia_chi = 'Liên Chiểu';

