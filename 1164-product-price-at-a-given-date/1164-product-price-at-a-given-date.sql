# # Write your MySQL query statement below
# SELECT product_id,
#     new_price as price
# FROM Products
# WHERE change_date = '2019-08-16' 
with prod as 
    (select 
            product_id, 
            max(change_date) as ldate  
    from Products 
    where change_date<='2019-08-16' 
    group by product_id)

select distinct 
            p.product_id,
            coalesce(pri.new_price,10) as price 
from Products p left join prod pr
on pr.product_id=p.product_id 
left join Products pri 
on pri.product_id=p.product_id and pri.change_date=pr.ldate