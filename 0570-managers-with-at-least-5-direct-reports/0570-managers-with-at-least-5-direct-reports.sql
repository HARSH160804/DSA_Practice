# Write your MySQL query statement below
select b.name 
from employee a
join Employee b
on a.managerId=b.id
group by b.id,b.name
having count(*)>=5