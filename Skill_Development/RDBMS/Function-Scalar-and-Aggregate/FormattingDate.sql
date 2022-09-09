--- Write a query to display schedule id and the month name of the travel date as given in the sample output. Give an alias name as SCHEDULE_DATE. Display records in descending order by schedule id.

---Sample Output:
---SCHEDULE_DATE
--------------------------------------------------------------------
---S2 is scheduled on the month of May
---S1 is scheduled on the month of March

SELECT (SCHEDULE_ID ||' is scheduled on the month of '||initcap(TO_CHAR(TRAVEL_DATE, 'MONTH")))
AS SCHEDULE_DATE
FROM SCHEDULE
ORDER BY SCHEDULE_ID DESC;
