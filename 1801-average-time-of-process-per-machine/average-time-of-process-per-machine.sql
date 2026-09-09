# Write your MySQL query statement below
select a.machine_id ,round(avg(ae.timestamp-a.timestamp),3) as processing_time from Activity a
join Activity ae
on a.machine_id = ae.machine_id and a.activity_type='start' and ae.activity_type='end' and a.process_id=ae.process_id
group by a.machine_id