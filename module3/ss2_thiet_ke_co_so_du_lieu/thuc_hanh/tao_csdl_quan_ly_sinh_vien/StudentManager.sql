CREATE DATABASE StudentManager;
USE StudentManager;

CREATE TABLE Student(
    StudentID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    StudentName VARCHAR(30) NOT NULL,
    Address VARCHAR(50),
    Phone VARCHAR(20),
    `Status` BIT,
    ClassID INT NOT NULL
);

CREATE TABLE Class(
	ClassID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	ClassName VARCHAR(60) NOT NULL,
    StartDate DATETIME    NOT NULL,
    `Status`    BIT

);

CREATE TABLE Subjects(
    SubId   INT         PRIMARY KEY NOT NULL AUTO_INCREMENT,
    SubName VARCHAR(30) NOT NULL,
    Credit  TINYINT     NOT NULL DEFAULT 1 CHECK ( Credit >= 1 ),
    `Status`  BIT                  DEFAULT 1
);


CREATE TABLE Mark
(
    MarkId    INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    SubId     INT NOT NULL,
    StudentId INT NOT NULL,
    Mark      FLOAT   DEFAULT 0 CHECK ( Mark BETWEEN 0 AND 100),
    ExamTimes TINYINT DEFAULT 1,
    UNIQUE (SubId, StudentId),
    FOREIGN KEY (SubId) REFERENCES Subjects (SubId),
    FOREIGN KEY (StudentId) REFERENCES Student (StudentId)
);




