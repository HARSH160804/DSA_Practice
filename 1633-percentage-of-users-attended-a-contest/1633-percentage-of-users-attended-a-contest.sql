select b.contest_id , round(count(*) * 100/ (select count(a.user_id)from users a),2) as percentage
from Register b
group by b.contest_id  
order by percentage desc,b.contest_id asc