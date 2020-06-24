select country.continent, FLOOR(AVG(city.POPULATION)) from city join country on city.countrycode = country.code
group by country.continent;