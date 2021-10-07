CREATE DATABASE ScoreManager;
USE ScoreManager;

CREATE TABLE Student(
    IdStudent VARCHAR(20) PRIMARY KEY,
    NameStudent VARCHAR(50),
    BirthDay DATETIME,
    Class VARCHAR(20),
    Gender VARCHAR(20)
);

CREATE TABLE Subjects(
    IdSubject VARCHAR(20) PRIMARY KEY,
    NameSubject VARCHAR(50)
);

CREATE TABLE ScoreBoard(
    IdStudent VARCHAR(20),
    IdSubject VARCHAR(20),
    Score INT,
    TestDay DATETIME,
    PRIMARY KEY (IdStudent, IdSubject),
    FOREIGN KEY (IdStudent) REFERENCES Student(IdStudent),
    FOREIGN KEY (IdSubject) REFERENCES Subjects(IdSubject)
);

CREATE TABLE Teacher(
    IdTeacher VARCHAR(20) PRIMARY KEY,
    NameTeacher VARCHAR(20),
    PhoneNumber VARCHAR(10)
);

ALTER TABLE Subjects ADD IdTeacher VARCHAR(20);
ALTER TABLE Subjects ADD CONSTRAINT FK_IdTeacher FOREIGN KEY (IdTeacher) REFERENCES Teacher(IdTeacher);

