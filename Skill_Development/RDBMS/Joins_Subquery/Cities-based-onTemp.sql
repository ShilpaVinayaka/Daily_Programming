---Write a query to display all the town names and state name which has winter temperature less than "PONDICHERRY". Output should be sorted on town name.
---(Hint: Data is case sensitive. Town name may be in any case.)

SELECT T.townname, T.state
FROM Town T
WHERE T.wintertemp<(SELECT DISTINCT wintertemp
FROM Town WHERE Upper(townname)='PONDICHERRY')
ORDER BY T.townname;
