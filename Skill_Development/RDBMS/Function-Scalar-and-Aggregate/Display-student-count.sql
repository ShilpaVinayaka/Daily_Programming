---Write a query to display the department id and number of students in each department. Give an alias as STUDENT_COUNT. Sort the result based on STUDENT_COUNT in descending order.

SELECT D.department_id AS Department_ID, COUNT(S.Student_id) AS STUDENT_COUNT
FROM DEPARTMENT D, STUDENT S
WHERE D.Department_ID = S.Department_ID
GROUP BY D.Department_ID
ORDER BY STUDENT_COUNT DESC;
