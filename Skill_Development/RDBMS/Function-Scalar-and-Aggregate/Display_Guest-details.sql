---Management wants to display the resort details in which total guest stayed without any children. 

---Write a query to display the resort Id, the total guests stayed as "TOTAL_GUEST" in each resort. Total guest will be calculated by considering both adult count and pet count. The result set should be in the ascending order of resort id.

SELECT R.resortID, SUM(B.adultCount)+SUM(B.petCount) AS TOTAL_GUEST
FROM Resort R, Booking B
WHERE R.resortID = B.resortID AND B.childCount=0
GROUP BY B.resortID
ORDER BY R.resortID ASC;
