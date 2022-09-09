---Write a query to display the student Id, first name, last name and street of all the students who all from 'Chennai' or 'Bangalore'. Sort the records based the first name in ascending order.

SELECT StudId, FirstName, LastName, Street
FROM STUDENT
WHERE City='Chennai' OR City='Bangalore'
ORDER BY FirstName ASC;
