---Write a query to display all the courses whose name starts with 'C'. Sort the result set based on the course name in ascending order. 

---(Hint: Data is case sensitive)

SELECT CourseName 
FROM COURSE
WHERE CourseName LIKE 'C%' ORDER BY CourseName ASC;
