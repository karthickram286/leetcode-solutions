/*
Enter your query here.
*/
select ROUND(LONG_W, 4) from STATION where LAT_N = 
(select MAX(LAT_N) from STATION WHERE LAT_N < 137.2345);
