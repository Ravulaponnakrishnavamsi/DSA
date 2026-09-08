-- Write your PostgreSQL query statement below
select id from weather w
where temperature>(select temperature from weather 
where recordDate=w.recordDate-1);