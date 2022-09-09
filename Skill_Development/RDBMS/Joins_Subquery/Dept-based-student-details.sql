---Write a query to display list of students name and their department name who all are not from Coimbatore and belongs to 'MECH' department. Sort the result based on students name.

---(Hint : Data is case sensitive)
SELECT S.student_name, D.department_name
FROM Student S, Department D
WHERE S.department_id = D.department_id AND S.city<>'Coimbatore'
AND D.department_name = 'MECH'
ORDER BY S.student_name;
