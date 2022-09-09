---Write a query to display list of student ids and average mark in no decimal places if their average mark is less than 75. Give an alias to average mark as AVG_MARK. Sort the result based on average mark. 

SELECT S.student_id, ROUND(AVG(M.value)) AS AVG_MARK
FROM Student S, Mark M
WHERE S.student_id = M.student_id
GROUP BY S.student_id
HAVING AVG(M.value)<75
ORDER BY AVG_MARK;
-- SELECT student_id, value FROM MARK;
