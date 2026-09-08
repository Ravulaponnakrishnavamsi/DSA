# Write your MySQL query statement below

select p.product_name,year,price from sales s
inner join 
Product p

on p.product_id=s.product_id;