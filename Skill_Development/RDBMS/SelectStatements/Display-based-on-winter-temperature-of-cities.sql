---Display the town names whose winter temperature is above 15 degree. Display the result in the descending order of winter temperature.

SELECT Townname FROM Town
WHERE wintertemp>15
ORDER BY wintertemp DESC;
