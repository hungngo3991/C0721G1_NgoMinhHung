DROP DATABASE furama_resort;

CREATE DATABASE furama_resort;

USE furama_resort;

CREATE TABLE `position` (
    position_id INT PRIMARY KEY AUTO_INCREMENT,
    position_name VARCHAR(45) NOT NULL
);

CREATE TABLE education_degree (
    education_degree_id INT PRIMARY KEY AUTO_INCREMENT,
    education_degree_name VARCHAR(45) NOT NULL
);

CREATE TABLE division (
    division_id INT PRIMARY KEY AUTO_INCREMENT,
    division_name VARCHAR(45) NOT NULL
);

CREATE TABLE employee (
    employee_id INT PRIMARY KEY AUTO_INCREMENT,
    employee_name VARCHAR(45) NOT NULL,
    position_id INT NOT NULL,
    education_degree_id INT NOT NULL,
    division_id INT NOT NULL,
    FOREIGN KEY (position_id) REFERENCES `position` (position_id) on update cascade on delete cascade,
    FOREIGN KEY (education_degree_id) REFERENCES education_degree (education_degree_id) on update cascade on delete cascade,
    FOREIGN KEY (division_id) REFERENCES division (division_id) on update cascade on delete cascade,
    birthday DATE NOT NULL,
    id_card VARCHAR(45) NOT NULL,
    salary DOUBLE NOT NULL,
    phone VARCHAR(45) NOT NULL,
    email VARCHAR(45) NOT NULL,
    address VARCHAR(45) NOT NULL
);

CREATE TABLE customer_type (
    customer_type_id INT PRIMARY KEY AUTO_INCREMENT,
    customer_type_name VARCHAR(45) NOT NULL
);

CREATE TABLE customer (
    customer_id INT PRIMARY KEY AUTO_INCREMENT,
    customer_type_id INT NOT NULL,
    FOREIGN KEY (customer_type_id) REFERENCES customer_type (customer_type_id) on update cascade on delete cascade,
    customer_name VARCHAR(45) NOT NULL,
    birthday DATE NOT NULL,
    gender BIT(1) NOT NULL,
    id_card VARCHAR(45) NOT NULL,
    phone VARCHAR(45) NOT NULL,
    email VARCHAR(45) NOT NULL,
    address VARCHAR(45) NOT NULL
);

CREATE TABLE rent_type (
    rent_type_id INT PRIMARY KEY AUTO_INCREMENT,
    rent_type_name VARCHAR(45) NOT NULL,
    cost DOUBLE NOT NULL
);

CREATE TABLE service_type (
    service_type_id INT PRIMARY KEY AUTO_INCREMENT,
    service_type_name VARCHAR(45) NOT NULL
);

CREATE TABLE service (
    service_id INT PRIMARY KEY AUTO_INCREMENT,
    service_name VARCHAR(45) NOT NULL,
    `area` INT NOT NULL,
    cost DOUBLE NOT NULL,
    max_people INT NOT NULL,
    rent_type_id INT NOT NULL,
    service_type_id INT NOT NULL,
    FOREIGN KEY (rent_type_id) REFERENCES rent_type (rent_type_id) on update cascade on delete cascade,
    FOREIGN KEY (service_type_id) REFERENCES service_type (service_type_id) on update cascade on delete cascade,
    standard_room VARCHAR(45),
    description_other_convenience VARCHAR(45),
    pool_area DOUBLE,
    number_of_floors INT,
    free_service_included VARCHAR(45)
);

CREATE TABLE contract (
    contract_id INT PRIMARY KEY AUTO_INCREMENT,
    employee_id INT NOT NULL,
    customer_id INT NOT NULL,
    service_id INT NOT NULL,
    FOREIGN KEY (employee_id) REFERENCES employee (employee_id) on update cascade on delete cascade,
    FOREIGN KEY (customer_id) REFERENCES customer (customer_id) on update cascade on delete cascade,
    FOREIGN KEY (service_id) REFERENCES service (service_id) on update cascade on delete cascade,
    contract_start_date DATETIME NOT NULL,
    contract_end_date DATETIME NOT NULL,
    deposit DOUBLE NOT NULL,
	total_money DOUBLE
);

CREATE TABLE attach_service (
    attach_service_id INT PRIMARY KEY AUTO_INCREMENT,
    attach_service_name VARCHAR(45) NOT NULL,
    cost DOUBLE NOT NULL,
    unit INT NOT NULL,
    `status` VARCHAR(45) NOT NULL
);

CREATE TABLE contract_detail (
    contract_detail_id INT PRIMARY KEY AUTO_INCREMENT,
    contract_id INT NOT NULL,
    attach_service_id INT NOT NULL,
    FOREIGN KEY (contract_id) REFERENCES contract (contract_id) on update cascade on delete cascade,
    FOREIGN KEY (attach_service_id) REFERENCES attach_service (attach_service_id) on update cascade on delete cascade,
    quantity INT NOT NULL
);

INSERT INTO `position` (position_name)
VALUES
('Receptionist'),
('Staff'),
('Expert'),
('Supervisor'),
('Manager'),
('CEO');

INSERT INTO education_degree (education_degree_name)
VALUES
('Intermediate'),
('College'),
('University'),
('Postgraduate');

INSERT INTO division (division_name)
VALUES
('Sale - Marketing'),
('Administrative'),
('Service'),
('Management');

INSERT INTO employee (employee_name, position_id, education_degree_id, division_id, birthday, id_card, salary, phone, email, address)
VALUES
('Ngô Văn Nam', 3, 2, 1, '1990-03-05', '4242423423', 7000000, '0382948989', 'Nam@gmail.com', 'Đà Nẵng'),
('Nguyễn Thị Hoa', 2, 1, 3, '1995-09-08', '4535353543', 5000000, '0943583989', 'Hoa@gmail.com', 'Hà Nội'),
('Nguyễn Minh Đức', 6, 3, 4, '1980-06-07', '4242423424', 100000000, '0382948987', 'Duc@gmail.com', 'Sài Gòn'),
('Nguyễn Thị Phượng', 2, 2, 3, '1970-05-05', '4242423425', 500000, '0945345564', 'Phuong@gmail.com', 'Vinh'),
('Ngô Văn Quang', 3, 4, 3, '1975-06-06', '4242423426', 500000, '0342434434', 'Quang@gmail.com', 'Đà Nẵng');

INSERT INTO customer_type (customer_type_name)
VALUES
('Diamond'),
('Platinium'),
('Gold'),
('Silver'),
('Member');

INSERT INTO customer (customer_type_id, customer_name, birthday, gender, id_card, phone, email, address)
VALUES
(3, 'Nguyễn Văn Hải', '1994-03-11', 1, '4242424242', '0134543543', 'Hai@gmail.com', 'Đà Nẵng'),
(2, 'Nguyễn Thị Hồng', '1995-04-11', 0, '4242424243', '0134543544', 'Hong@gmail.com', 'Hà Nội'),
(1, 'Lý Văn Khoa', '1995-04-12', 1, '4242424244', '0134543545', 'Khoa@gmail.com', 'Vinh'),
(1, 'Nguyễn Thành Nam', '1990-03-03',1, '4242424245', '0954454343', 'Nam@gmail.com', 'Hà Nội'),
(4, 'Nguyễn Thị Hồng', '1992-04-04',0, '4242424246', '0234545454', 'NTHong@gmail.com', 'Quảng Ngãi');

INSERT INTO rent_type (rent_type_name, cost)
VALUES
('Year', 500000000),
('Month', 100000000),
('Day', 50000000),
('Hour', 1000000);

INSERT INTO service_type (service_type_name)
VALUES
('Villa'),
('House'),
('Room');




INSERT INTO service (service_name, `area`, cost, max_people, rent_type_id, service_type_id, standard_room, description_other_convenience,
pool_area, number_of_floors)
VALUES
('Villa 1', 100, 1000000, 6, 1, 1, 'Deluxe', 'This villa has a sea view', 50, 3);

INSERT INTO service (service_name, `area`, cost, max_people, rent_type_id, service_type_id, standard_room, description_other_convenience, number_of_floors)
VALUES
('House 1', 50, 500000, 4, 1, 2, 'Standard', 'This house has hot water system', 2);

INSERT INTO service (service_name, `area`, cost, max_people, rent_type_id, service_type_id, free_service_included)
VALUES
('Room 1', 25, 150000, 2, 1, 3,'Towel');




INSERT INTO contract (employee_id, customer_id, service_id, contract_start_date, contract_end_date, deposit)
VALUES
(1, 3, 1, '2021-05-05', '2021-06-05', 1000000),
(2, 2, 2, '2021-06-04', '2021-07-07', 1500000),
(3, 1, 1, '2021-10-02', '2021-11-03', 2000000),
(2, 4, 3, '2019-03-03', '2019-04-03', 2000000),
(5, 3, 3, '2015-04-04', '2015-05-04', 2000000);

INSERT INTO attach_service (attach_service_name, cost, unit, `status`)
VALUES
('Massage', 500000, 1, 'Availability'),
('Karaoke', 300000, 1, 'Availability'),
('Food', 150000, 1, 'Availability'),
('Water', 50000, 1, 'Availability'),
('Car rental', 1000000, 1, 'Availability');

INSERT INTO contract_detail (contract_id, attach_service_id, quantity)
VALUES
(1, 5, 2),
(2, 4, 4),
(3, 2, 5),
(2, 2, 3),
(4, 5, 1);




