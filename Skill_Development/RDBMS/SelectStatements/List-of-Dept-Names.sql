---Write a query to display the name of departments that are not present in the block number 3. Sort the records based on the department name in ascending order.
SELECT department_name
FROM Department
WHERE department_block_number<>3
ORDER BY department_name ASC;
