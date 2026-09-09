# Write your MySQL query statement below
select p.product_id ,ifnull(round(sum(p.price*s.units)/sum(s.units),2),0) as average_price from prices p
left join UnitsSold s
on s.product_id=p.product_id and s.purchase_date BETWEEN p.start_date AND p.end_date
group by p.product_id;