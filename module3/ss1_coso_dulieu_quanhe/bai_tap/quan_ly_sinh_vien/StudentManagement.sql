DROP DATABASE IF EXISTS manager_student;
CREATE DATABASE manager_student;
USE manager_student;

CREATE TABLE Class (
	id INT NOT NULL,
    `name` VARCHAR(45) NULL


);

CREATE TABLE Teacher (
	id INT NOT NULL,
    `name` VARCHAR(10) NULL,
    age INT NULL,
    country VARCHAR(10) NULL


);