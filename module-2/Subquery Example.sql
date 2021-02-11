-- The names of the countries that speak English
--
-- The country language table has the country codes that speak each language.
--
--

select name
from country
where code in (select countrycode
               from countrylanguage
               where language = 'English')
;

-- We need data from more than one table - country table and city table
--
-- Whenever you  need data from more than one table - code a join
--
-- Two formats for coding a join:
--
--      1. Classic syntax - code all the tables on the from and join condition on the WHERE clause
--      2. Modern syntax - code the type of join between the table names and the join condition on an ON clause


---------------------------------------------------------------------
-- Classic Syntax Join
---------------------------------------------------------------------
select country.name, city.name, district
from country, city
where country.code = city.countrycode
and country.code = 'USA'
;

---------------------------------------------------------------------
-- Modern Syntax Join
---------------------------------------------------------------------
select country.name, city.name, district --
from country
        inner join
        city
      on country.code = city.countrycode
      where country.code = 'USA'
;

