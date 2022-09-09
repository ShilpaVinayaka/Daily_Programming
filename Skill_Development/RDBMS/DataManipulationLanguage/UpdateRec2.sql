---Write a query to change the source to 'Chennai' and destination to 'Coimbatore' for the schedule id 'S4' in schedule table.

---Hint: Data is case sensitive

UPDATE SCHEDULE SET SOURCE='Chennai', DESTINATION='Coimbatore'
WHERE SCHEDULE_ID='S4';
