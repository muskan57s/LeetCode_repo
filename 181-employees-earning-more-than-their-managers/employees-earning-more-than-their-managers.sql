# Write your MySQL query statement below
SELECT e1.name as Employee from Employee as e1 
Inner join Employee as e2 ON e1.managerID = e2.id
where
e1.salary > e2.salary