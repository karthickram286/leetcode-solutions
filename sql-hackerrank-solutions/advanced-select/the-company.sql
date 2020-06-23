/*
Enter your query here.
*/
select c.company_code, c.founder, COUNT(DISTINCT lm.lead_manager_code), COUNT(DISTINCT sm.senior_manager_code), COUNT(DISTINCT m.manager_code), COUNT(DISTINCT e.employee_code)
from Company c, Lead_Manager lm, Senior_Manager sm, Manager m, Employee e
where c.company_code = lm.company_code and
    lm.lead_manager_code = sm.lead_manager_code and
    sm.senior_manager_code = m.senior_manager_code and 
    m.manager_code = e.manager_code
group by c.company_code, c.founder order by c.company_code;