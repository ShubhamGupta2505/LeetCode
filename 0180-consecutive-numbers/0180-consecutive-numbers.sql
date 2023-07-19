# With cte_num AS (Select Num AS V1, LEAD(num,1) Over (order by id) AS V2, LEAD(num,2) Over (order by id) AS V3 From Logs)
# Select V1 AS ConsecutiveNums from cte_num
# where V1=V2
# And V2=V3
with cte as (
    select num,
    lead(num,1) over() num1,
    lead(num,2) over() num2
    from logs

)

select distinct num ConsecutiveNums from cte where (num=num1) and (num=num2)