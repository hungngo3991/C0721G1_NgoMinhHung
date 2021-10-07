CREATE DATABASE QuanLyBanHang;

USE QuanLyBanHang;

CREATE TABLE Customer(
    c_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    c_name VARCHAR(20) NOT NULL,
    c_age INT
);

CREATE TABLE `Order`(
    o_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    c_id INT NOT NULL,
    o_date DATE NOT NULL,
    o_totalprice INT NOT NULL,
    FOREIGN KEY (c_id) REFERENCES Customer (c_id)
);

CREATE TABLE Product (
    p_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    p_name VARCHAR(20) NOT NULL,
    p_price INT NOT NULL
);

CREATE TABLE OrderDetail (
    o_id INT NOT NULL,
    p_id INT NOT NULL,
    od_qty INT NOT NULL,
    PRIMARY KEY (o_id , p_id),
    FOREIGN KEY (o_id) REFERENCES `order` (o_id),
    FOREIGN KEY (p_id) REFERENCES Product (p_id)
);

