CREATE DATABASE demo;

USE demo;


CREATE TABLE products (
id INT PRIMARY KEY AUTO_INCREMENT,
product_code VARCHAR(45) NOT NULL,
product_name VARCHAR(45) NOT NULL,
product_price INT NOT NULL,
product_amount INT NOT NULL,
product_description VARCHAR(100) NOT NULL,
product_status VARCHAR(45) NOT NULL
);


INSERT INTO products (product_code, product_name, product_price, product_amount, product_description, product_status)
VALUES
('BMW01', 'BMW X1', 500000000, 200, 'Old generation', 'In stock'),
('BMW02', 'BMW X2', 1000000000, 100, 'Old generation', 'In stock'),
('BMW03', 'BMW X3', 1500000000, 50, 'New generation', 'Out of stock');


CREATE UNIQUE INDEX product_code ON products (product_code);


ALTER TABLE products ADD INDEX productname_productprice (product_name, product_price);


EXPLAIN SELECT * FROM products WHERE product_code = 'BMW01';

EXPLAIN SELECT * FROM products WHERE product_name = 'BMW X3' AND product_price = 1500000000;



CREATE VIEW products_view AS
SELECT product_code, product_name, product_price, product_status
FROM products;

SELECT * FROM products_view;


CREATE OR REPLACE VIEW products_view AS
SELECT product_code, product_name, product_price, product_amount, product_description, product_status
FROM products
WHERE product_amount <= 200;

SELECT * FROM products_view;


DROP VIEW products_view;



DELIMITER //

CREATE PROCEDURE findAllProducts()

BEGIN

SELECT * FROM products;

END //

DELIMITER ;

CALL findAllProducts();


DELIMITER //

DROP PROCEDURE IF EXISTS `findAllProducts` //

CREATE PROCEDURE findAllProducts()

BEGIN

INSERT INTO products (product_code, product_name, product_price, product_amount, product_description, product_status)
VALUES 
('BMW04', 'BMW X4', 1700000000, 20, 'New generation', 'Out of stock');

END //

CALL findAllProducts();


DELIMITER //

DROP PROCEDURE IF EXISTS `findAllProducts` //

CREATE PROCEDURE findAllProducts()

BEGIN

UPDATE products
SET product_amount = 15
WHERE id = 4;

END //


CALL findAllProducts();


DELIMITER //

DROP PROCEDURE IF EXISTS `findAllProducts` //

CREATE PROCEDURE findAllProducts()

BEGIN

DELETE FROM products
WHERE id = 4;

END //


CALL findAllProducts();