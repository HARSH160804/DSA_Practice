select b.name as name 
from Employee a
join Employee b
on a.managerId=b.id
group by b.id,b.name
having count(*)>=5

