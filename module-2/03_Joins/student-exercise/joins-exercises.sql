-- The following queries utilize the "dvdstore" database.

-- 1. All of the films that Nick Stallone has appeared in
-- (30 rows)

select title
from film
        inner join
        film_actor
        on film.film_id = film_actor.film_id
        join
        actor
        on film_actor.actor_id = actor.actor_id
where actor.first_name = 'NICK' and actor.last_name = 'STALLONE'
;       

-- 2. All of the films that Rita Reynolds has appeared in
-- (20 rows)

select title
from film
        inner join
        film_actor
        on film.film_id = film_actor.film_id
        join
        actor
        on film_actor.actor_id = actor.actor_id
where actor.first_name = 'RITA' and actor.last_name = 'REYNOLDS'
;       

-- 3. All of the films that Judy Dean or River Dean have appeared in
-- (46 rows)

select title
from film
        inner join
        film_actor
        on film.film_id = film_actor.film_id
        join
        actor
        on film_actor.actor_id = actor.actor_id
where actor.first_name = 'JUDY' or actor.first_name = 'RIVER' and actor.last_name = 'DEAN'
;       

-- 4. All of the the ‘Documentary’ films
-- (68 rows)

select title
from film
        inner join
        film_category
        on film.film_id = film_category.film_id
        join
        category
        on category.category_id = film_category.category_id
where category.name = 'Documentary'
;

-- 5. All of the ‘Comedy’ films
-- (58 rows)

select title
from film
        inner join
        film_category
        on film.film_id = film_category.film_id
        join
        category
        on category.category_id = film_category.category_id
where category.name = 'Comedy'
;

-- 6. All of the ‘Children’ films that are rated ‘G’
-- (10 rows)

select title
from film
        inner join
        film_category
        on film.film_id = film_category.film_id
        join
        category
        on category.category_id = film_category.category_id
where category.name = 'Children' and film.rating = 'G'
;

-- 7. All of the ‘Family’ films that are rated ‘G’ and are less than 2 hours in length
-- (3 rows)

select title
from film
        inner join
        film_category
        on film.film_id = film_category.film_id
        join
        category
        on category.category_id = film_category.category_id
where category.name = 'Family' and film.rating = 'G' and film.length < 120
;

-- 8. All of the films featuring actor Matthew Leigh that are rated ‘G’
-- (9 rows)

select title
from film
        inner join
        film_category
        on film.film_id = film_category.film_id
        join
        category
        on category.category_id = film_category.category_id
where category.name = 'Family' and film.rating = 'G' and film.length < 120
;

-- 9. All of the ‘Sci-Fi’ films released in 2006
-- (61 rows)

select title
from film
        inner join
        film_category
        on film.film_id = film_category.film_id
        join
        category
        on category.category_id = film_category.category_id
where category.name = 'Sci-Fi' and film.release_year = 2006
;

-- 10. All of the ‘Action’ films starring Nick Stallone
-- (2 rows)

select title
from film
        inner join
        film_category
        on film.film_id = film_category.film_id
        join
        category
        on category.category_id = film_category.category_id
        join
        film_actor
        on film.film_id = film_actor.film_id
        join
        actor
        on film_actor.actor_id = actor.actor_id
where category.name = 'Action' and actor.first_name = 'NICK' and actor.last_name = 'STALLONE'
;
-- 11. The address of all stores, including street address, city, district, and country
-- (2 rows)

select address, city, district, country
from store
        inner join
        address
        on store.address_id = address.address_id
        join
        city
        on address.city_id = city.city_id
        join
        country
        on city.country_id = country.country_id
;

-- 12. A list of all stores by ID, the store’s street address, and the name of the store’s manager
-- (2 rows)

select store_id, address, first_name, last_name
from staff
        inner join
        address
        on staff.address_id = address.address_id
;

-- 13. The first and last name of the top ten customers ranked by number of rentals
-- (#1 should be “ELEANOR HUNT�? with 46 rentals, #10 should have 39 rentals)

select first_name, last_name, count(*)
from rental
        inner join
        customer
        on rental.customer_id = customer.customer_id
        group by customer.customer_id
        order by count desc
        limit 10
;

-- 14. The first and last name of the top ten customers ranked by dollars spent
-- (#1 should be “KARL SEAL�? with 221.55 spent, #10 should be “ANA BRADLEY�? with 174.66 spent)

select first_name, last_name, sum(amount)
from payment 
        inner join
        customer
        on payment.customer_id = customer.customer_id
        group by customer.customer_id
        order by sum(amount) desc
        limit 10
;

-- 15. The store ID, street address, total number of rentals, total amount of sales (i.e. payments), and average sale of each store.
-- (NOTE: Keep in mind that while a customer has only one primary store, they may rent from either store.)
-- (Store 1 has 7928 total rentals and Store 2 has 8121 total rentals)

select store_id, address, count(payment.rental_id), sum(amount) as total_sales, round(avg(amount), 2) as average_sale
from payment
        inner join
        rental
        on payment.rental_id = rental.rental_id
        join
        staff
        on rental.staff_id = staff.staff_id
        join
        address
        on staff.address_id = address.address_id
        group by store_id, address
;

-- 16. The top ten film titles by number of rentals
-- (#1 should be “BUCKET BROTHERHOOD�? with 34 rentals and #10 should have 31 rentals)

select title, count(*)
from rental
        inner join
        inventory
        on rental.inventory_id = inventory.inventory_id
        join
        film
        on inventory.film_id = film.film_id
        group by title
        order by count desc
        limit 10
 ;

-- 17. The top five film categories by number of rentals
-- (#1 should be “Sports�? with 1179 rentals and #5 should be “Family�? with 1096 rentals)

select name, count(*)
from category
        inner join
        film_category
        on category.category_id = film_category.category_id
        join
        film
        on film_category.film_id = film.film_id
        join
        inventory
        on film.film_id = inventory.film_id
        join
        rental
        on inventory.inventory_id = rental.inventory_id
        group by name
        order by count desc
        limit 5
       ;

-- 18. The top five Action film titles by number of rentals
-- (#1 should have 30 rentals and #5 should have 28 rentals)

select title, count(rental_id)
from film
        inner join
        film_category
        on film.film_id = film_category.film_id
        join
        category
        on film_category.category_id = category.category_id
        join
        inventory
        on film.film_id = inventory.film_id
        join
        rental
        on inventory.inventory_id = rental.inventory_id
        where name = 'Action'
        group by title
        order by count desc
        limit 5
;

-- 19. The top 10 actors ranked by number of rentals of films starring that actor
-- (#1 should be “GINA DEGENERES�? with 753 rentals and #10 should be “SEAN GUINESS�? with 599 rentals)

select first_name, last_name, count(*)
from actor
        inner join
        film_actor
        on actor.actor_id = film_actor.actor_id
        join
        film
        on film_actor.film_id = film.film_id
        join
        inventory
        on film.film_id = inventory.film_id
        join
        rental
        on inventory.inventory_id = rental.inventory_id
        group by first_name, last_name
        order by count desc
        limit 10
;

-- 20. The top 5 “Comedy�? actors ranked by number of rentals of films in the “Comedy�? category starring that actor
-- (#1 should have 87 rentals and #5 should have 72 rentals)

select first_name, last_name, count(*)
from actor
        inner join
        film_actor
        on actor.actor_id = film_actor.actor_id
        join
        film
        on film_actor.film_id = film.film_id
        join
        film_category
        on film.film_id = film_category.film_id
        join
        category
        on film_category.category_id = category.category_id
        join
        inventory
        on film.film_id = inventory.film_id
        join
        rental
        on inventory.inventory_id = rental.inventory_id
        where name = 'Comedy'
        group by first_name, last_name
        order by count desc
        limit 5
;