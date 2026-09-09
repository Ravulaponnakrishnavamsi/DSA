# Write your MySQL query statement below
select name,be.bonus from Employee e
left join Bonus be
on e.empId=be.empId
where be.bonus<1000 or be.bonus is null;
