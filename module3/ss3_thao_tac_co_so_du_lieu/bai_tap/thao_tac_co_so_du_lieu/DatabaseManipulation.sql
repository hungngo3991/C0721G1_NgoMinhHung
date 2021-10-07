USE quanlybanhang;

INSERT INTO customer (c_name, c_age)
VALUES
('Minh Quan', 10),
('Ngoc Oanh', 20),
('Hong Ha', 50);


ALTER TABLE `order`
MODIFY o_totalprice INT NULL;


INSERT INTO `order` (c_id, o_date)
VALUES
(1, '2006-03-21'),
(2, '2006-03-23'),
(1, '2006-03-16');

INSERT INTO product (p_name, p_price)
VALUES
('May Giat', 3),
('Tu Lanh', 5),
('Dieu Hoa', 7),
('Quat', 1),
('Bep Dien', 2);

INSERT INTO orderdetail
VALUES
(1, 1, 3),
(1, 3, 7),
(1, 4, 2),
(2, 1, 1),
(3, 1, 8),
(2, 5, 4),
(2, 3, 3);

SELECT o_id, o_date, o_totalprice
FROM `order`;
    
    
  
SELECT c.c_id, c.c_name, c.c_age, p.p_id, p.p_name, p.p_price, o.o_date
FROM customer c JOIN `order` o ON c.c_id = o.c_id
JOIN orderdetail od ON o.o_id = od.o_id
JOIN product p ON p.p_id = od.p_id;



SELECT c_name FROM customer  WHERE c_id NOT IN (SELECT c_id FROM `order`);



SELECT o.o_id, o.o_date, SUM(od.od_qty * p.p_price) AS total
FROM `order` o JOIN orderdetail od ON o.o_id = od.o_id
JOIN product p ON od.p_id = p.p_id
GROUP BY od.o_id;            


