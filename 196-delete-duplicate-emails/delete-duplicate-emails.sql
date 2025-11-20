# Write your MySQL query statement below
DELETE p1 from Person as p1
join Person as p2
ON p1.email = p2.email
AND p1.id > p2.id