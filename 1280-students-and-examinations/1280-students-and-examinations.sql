select a.student_id,a.student_name,b.subject_name, count(c.subject_name) as attended_exams
from Students a
cross join Subjects b
left join Examinations c
on c.student_id = a.student_id and b.subject_name =c.subject_name 
group by a.student_name,a.student_id,b.subject_name
order by
    a.student_id,
    b.subject_name

