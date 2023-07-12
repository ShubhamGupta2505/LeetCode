# Write your MySQL query statement below
SELECT ROUND(SUM(tiv_2016),2) as tiv_2016
FROM Insurance 
WHERE tiv_2015 in (SELECT tiv_2015 FROM Insurance GROUP BY tiv_2015 HAVING COUNT(tiv_2015)>1) and concat(lat,lon) not in (SELECT concat(lat,lon) FROM Insurance GROUP BY lat,lon HAVING COUNT(concat(lat,lon))>1)

