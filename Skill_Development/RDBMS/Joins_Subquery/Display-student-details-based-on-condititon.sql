---Write a query to display list of students name and city who all are from CSE department. Sort the result based on students name in ascending order.
---Hint:Use Subquery

SELECT S.student_name, S.city
FROM STUDENT S
WHERE department_id = (SELECT department_id FROM Department
WHERE department_name = 'CSE')
ORDER BY S.student_name;
