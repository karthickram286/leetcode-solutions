/*
Enter your query here.
*/

select (months * salary) as max_earning, COUNT(*) as employee_count 
from employee
GROUP BY max_earning
ORDER BY max_earning DESC
limit 1;