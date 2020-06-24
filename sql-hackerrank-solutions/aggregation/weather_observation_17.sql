/*
Enter your query here.
*/
select ROUND(LONG_W, 4) from STATION where LAT_N = 
(select MIN(LAT_N) from STATION WHERE LAT_N > 38.7780);
