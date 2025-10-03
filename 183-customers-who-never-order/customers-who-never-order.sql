# Write your MySQL query statement below
SELECT c1.name as Customers from Customers as c1
LEFT JOIN Orders as c2 ON c1.id = c2.customerID
WHERE c2.id  Is NULL;