# Write your MySQL query statement below
WITH CTE AS(
SELECT
    E.id,
    D.name Department,
	E.name EmployeeName,
	E.salary,
	DENSE_RANK() OVER(PARTITION BY D.name ORDER BY E.salary DESC) RANKED
FROM
	Employee E
INNER JOIN
	Department D ON E.departmentId = D.id
)
SELECT
    D.name Department,
	E.name Employee,
    E.Salary Salary
FROM
	Employee E
INNER JOIN
    Department D ON E.departmentId = D.id
WHERE
	EXISTS (
		SELECT	
			1
		FROM
			CTE C
		WHERE
			E.id = C.id
		AND
			C.RANKED BETWEEN 1 AND 3
	)