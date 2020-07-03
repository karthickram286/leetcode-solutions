/*
Enter your query here.
*/

/* Using Alias */
select c.company_code, c.founder, COUNT(DISTINCT lm.lead_manager_code), COUNT(DISTINCT sm.senior_manager_code), COUNT(DISTINCT m.manager_code), COUNT(DISTINCT e.employee_code)
from Company c, Lead_Manager lm, Senior_Manager sm, Manager m, Employee e
where c.company_code = lm.company_code and
    lm.lead_manager_code = sm.lead_manager_code and
    sm.senior_manager_code = m.senior_manager_code and 
    m.manager_code = e.manager_code
group by c.company_code, c.founder order by c.company_code;

/* Using Inner Join */
SELECT 
Company.company_code, 
Company.founder, 
COUNT (DISTINCT Lead_Manager.lead_manager_code),
COUNT (DISTINCT Senior_Manager.senior_manager_code),
COUNT (DISTINCT Manager.manager_code),
COUNT (DISTINCT Employee.employee_code)

from Company 
JOIN Lead_Manager ON Company.company_code = Lead_Manager.company_code
JOIN Senior_Manager ON Lead_Manager.lead_manager_code = Senior_Manager.lead_manager_code
JOIN Manager ON Senior_Manager.senior_manager_code = Manager.senior_manager_code
JOIN Employee ON Manager.manager_code = Employee.manager_code

GROUP BY Company.company_code, Company.founder
ORDER BY Company.company_code;