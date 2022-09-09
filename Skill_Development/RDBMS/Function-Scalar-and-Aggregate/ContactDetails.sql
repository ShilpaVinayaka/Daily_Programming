----Write a query to display the guest id, name and contact information of all the guest. Display the phone number in contact information if the phone number is not available then display the address. If the address is also not available then display the email id. If the email id is also not available then display 'NOT AVAILABLE' . Give alias name as "CONTACT_INFO". Sort the records based on the guest id in ascending order.

SELECT GuestID, name, 
CASE
  when phone is null and address is null and email is null then 'NOT AVAILABLE'
 when phone is null and address is null then email
 when phone is null then address
 else phone
END AS Contact_Info
FROM Guest
ORDER BY GuestID ASC
