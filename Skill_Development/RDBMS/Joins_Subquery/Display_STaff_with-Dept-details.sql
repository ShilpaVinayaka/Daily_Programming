Write a query to display the subject name, staff name and department name who handles that subject. Sort the records based on staff name in ascending order.
SELECT S.subject_name, ST.staff_name, D.department_name
FROM Subject S, Staff ST, Department D
Where S.staff_id = ST.staff_id AND ST.department_id = D.department_id
ORDER BY ST.staff_name;
