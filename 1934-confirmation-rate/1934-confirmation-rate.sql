# Write your MySQL query statement below
#count(confirm)/action

/*select a.user_id,
from Signups a
left join Confirmations b 
on a.user_id=b.user_id

group by a.user_id
having action = 'confirmed'*/

SELECT a.user_id,
       ROUND(AVG(
           CASE WHEN b.action = 'confirmed' THEN 1.0
                ELSE 0.0
           END
       ), 2) AS confirmation_rate
FROM Signups a
LEFT JOIN Confirmations b
    ON a.user_id = b.user_id
GROUP BY a.user_id;