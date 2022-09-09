---Write a query to display the name of the staffs that starts with the letter 'S'. Sort the records base on staff name in ascending order.

---(Hint : Data is case sensitive)

SELECT staff_name FROM Staff 
WHERE staff_name LIKE 'S%' ORDER BY staff_name ASC;
