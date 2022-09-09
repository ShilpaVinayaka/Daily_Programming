---Write a query to display list of subject names and minimum mark scored in 'Software Engineering' and 'Computer Programming' . Give an alias name as MIN_MARK for minimum mark column. Sort the result based on subject name in descending order.  

SELECT S.subject_name, MIN(M.value) AS MIN_MARK
FROM Subject S, Mark M
WHERE S.subject_id = M.subject_id AND (subject_name='Software Engineering'
OR subject_name='Computer Programming')
GROUP BY S.subject_name
ORDER BY S.subject_name DESC;
