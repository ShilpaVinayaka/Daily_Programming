---Display all the town names whose summer temperature ranges between 30 and 45. Sort the result set in the ascending order of the summer temperature.

SELECT townname
FROM Town
WHERE summertemp BETWEEN 30 AND 45
ORDER BY summpertemp ASC;
