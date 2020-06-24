/*
Enter your query here.
*/
-- select COUNT(*) from STATION order by id;
SELECT ROUND(LAT_N, 4)
FROM STATION
ORDER BY LAT_N
limit 1 offset 249;
