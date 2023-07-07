# Write your MySQL query statement below
SELECT e.employee_id,e.name,COUNT(m.reports_to) as reports_count,ROUND(AVG(m.age),0) as average_age 
FROM Employees e
JOIN Employees m
WHERE e.employee_id = m.reports_to
GROUP BY 1
ORDER BY 1