USE studentmanager;

SELECT subid, subname, `status`, MAX(credit) AS maxcredit
FROM subjects;


SELECT s.*, MAX(m.mark) AS maxmark
FROM subjects s JOIN mark m ON s.subid = m.subid;

SELECT s.*, AVG(m.mark) AS avgmark
FROM student s JOIN mark m ON s.studentid = m.studentid
GROUP BY s.studentid
ORDER BY avgmark DESC;

