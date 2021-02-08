--------------------------------------------------------------------------------------------------------
-- Basic SELECT Lecture Code
--------------------------------------------------------------------------------------------------------
-- -- indicates a comment - anything following on the line is ignored
--
-- SQL SELECT statement - retrieve values form the database (Read)
--
-- A SELECT statement is often referred to as a query
--
-- Basic syntax: (The order in which these is important/required)
--
--      SELECT   - columns to include in the result (seperate mutiple column reqeusts with commas)
--      FROM     - table containing rows used in the query 
--      WHERE    - rows to include in the result - WHERE predicates are similar to Java predicate (a predicate is a condition)
--      ORDER BY - sequence of rows in the result
--                 without an ORDER BY the sequence of the rows in the result is not predictable
--                 if the sequence of teh rows in teh result matter - code an ORDER BY
--
-- WHERE predicates:
--
--        =  <>  !=  >  >=  <  <= 
--        IN(list-of-values)      -- alterative to a series of = OR
--        NOT IN(list-of-values)  -- alterative to a series of != AND
--        BETWEEN value AND value
--        IS NULL
--        IS NOT NULL
--        LIKE    (use wildcards: % means 0 to any number of any characters
--                                _ means exactly any one character
--        ILIKE   (case insensivtive LIKE - Postgres extension)
--
-- predicates may be combined using AND and OR
--
-- use parentheses to make your multi-predicate condition clear

-- The DISTINCT clause on a SELECT removes duplicate values from the result
-- based on the all columns that follow
--
-- The DISTINCT ON(columns/expression) clause on a SELECT removes duplicate values from the result
-- based on the all columns/expression inside the parentheses that follow (Postgres extension)
------------------------------------------------------------------------------------------------------

-- Selecting the names for all countries
Select name                             -- list all the colunms you want to see in the result on the SELECT
from country                          -- specify the table with the column(s) you want on the FROM
;                                       -- marks the end of a SQL statement

-- Selecting the name and population of all countries

SELECT name, population                 -- List the column you want to see in the result on the SELECT
FROM country                            -- specity the table with columns you want on the FROM
;

select name, population from country;

SELECT population, name
FROM country
;

-- Selecting all columns from the city table

SELECT *
FROM city
;

-- SELECT ... FROM ... WHERE
-- Selecting the cities in Ohio

select name, district  -- district is the name of the column in the city table for what we call a state in the USA
from city
where district = 'Ohio' -- In SQL you put single quotes around strings, not double quotes like Java.
                        -- The case of the literal matters: 'Ohio" != 'ohio'. KNOW YOUR DATABASE!
;


-- Selecting countries that gained independence in the year 1776

select name from country where indepyear = 1776; --numeric values are NOT coded in single quotes


-- Selecting countries not in Asia
select name, continent from country where continent != 'Asia';

-- Selecting countries that do not have an independence year

select name from country where indepyear is null;

-- Selecting countries that do have an independence year

select name from country where indepyear is not null;


-- Selecting countries that have a population greater than 5 million

select name from country where population > 5000000;

-- SELECT ... FROM ... WHERE ... AND/OR
-- Selecting cities in Ohio and Population greater than 400,000

select name, district from city where district = 'Ohio' and population > 400000;

-- Selecting country names on the continent North America or South America

select name, continent from country where continent in ('North America', 'South America');

select name, continent from country where continent like '%America'; -- ends with the word 'America'

select name, continent from country where continent like '%America%'; -- contains he word 'America'


-- List the countries that gained independence in the 20th century

select name, indepyear from country where indepyear between 1900 and 1999;

-- SELECTING DATA w/arithmetic
-- Selecting the population, life expectancy, and population per area

select name
        , population as How_Many_People_Live_There 
        , lifeexpectancy as How_Long_They_Usually_Live
        , population/surfacearea as Population_Per_Area
from country
;



