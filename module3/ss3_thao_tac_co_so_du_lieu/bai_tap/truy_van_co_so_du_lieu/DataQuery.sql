USE StudentManager;

SELECT * FROM Student
WHERE StudentName LIKE 'h%';
    
SELECT * FROM Class
WHERE MONTH(StartDate) = 12;

SELECT * FROM Subjects
WHERE Credit BETWEEN 3 AND 5;

SET SQL_SAFE_UPDATES = 0;

UPDATE Student 
SET ClassID = 2
WHERE StudentName = 'Hung';


SELECT S.StudentName, Sub.SubName, M.Mark
FROM Student S JOIN Mark M ON S.StudentID = M.StudentID 
JOIN Subjects Sub ON M.SubId = Sub.SubId
ORDER BY M.Mark DESC;