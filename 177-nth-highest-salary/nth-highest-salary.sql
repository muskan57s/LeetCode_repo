CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
RETURN (
    SELECT IFNULL(
        (
            SELECT DISTINCT salary
            FROM Employee e1
            WHERE (
                SELECT COUNT(DISTINCT salary)
                FROM Employee e2
                WHERE e2.salary > e1.salary
            ) = N - 1
        ), NULL
    )
);
