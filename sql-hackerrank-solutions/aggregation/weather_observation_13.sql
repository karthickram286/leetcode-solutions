/*
Enter your query here.
*/
select ROUND(SUM(LAT_N), 4) as sum from STATION where LAT_N > 38.7880 and LAT_N < 137.2345;