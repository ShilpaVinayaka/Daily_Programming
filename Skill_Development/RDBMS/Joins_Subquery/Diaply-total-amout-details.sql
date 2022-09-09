---Display guest details who paid total charges RS.60000 and less. Write a query to fetch Guest id, Guest name and Sum of total charges. Give alias name to total charges as  TOTAL_AMOUNT_PAID. Sort the result by guest name in descending order.
SELECT G.GUESTID, G.NAME, SUM(B.TOTALCHARGE) AS TOTAL_AMOUNT_PAID
FROM GUEST G, BOOKING B
WHERE G.GUESTID = B.GUESTID
GROUP BY G.GUESTID, G.NAME
HAVING SUM(B.TOTALCHARGE)<=60000
ORDER BY G.NAME DESC;
