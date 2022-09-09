---Write a query to display the guest id, name, email and phone number of all the guest if and only if the phone number is available. Sort the records based on the name in ascending order.
SELECT guestID, name, email, phone
FROM Guest
WHERE phone IS NOT NULL
ORDER BY name ASC;
