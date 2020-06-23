/*
Enter your query here.
*/
select CONCAT(name, '(', LEFT(occupation, 1), ')') as shortname from OCCUPATIONS ORDER BY name;

SELECT CONCAT('There are a total of ', COUNT(*), ' ', LOWER(Occupation), 's.')
FROM Occupations
GROUP BY Occupation
ORDER BY COUNT(Occupation) ASC, Occupation;