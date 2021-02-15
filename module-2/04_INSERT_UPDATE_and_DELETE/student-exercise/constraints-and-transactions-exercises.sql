-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.

Begin transaction;

insert into actor (actor_id, first_name, last_name)
values (201, 'HAMPTON', 'AVENUE')
;

insert into actor (actor_id, first_name, last_name)
values (202, 'LISA', 'BYWAY')
;

select * from actor where actor_id > 200;

commit;

rollback;

-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in
-- ancient Greece", to the film table. The movie was released in 2008 in English.
-- Since its an epic, the run length is 3hrs and 18mins. There are no special
-- features, the film speaks for itself, and doesn't need any gimmicks.

Begin transaction;

insert into film (film_id, title, description, release_year, language_id, length)
values (1001, 'Euclidean PI', 'The epic story of Euclid as a pizza delivery boy in ancient Greece', 2008, 1, 198)
;

select * from film where film_id = 1001;

commit;

rollback;


-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.

Begin transaction;

insert into film_actor (actor_id, film_id)
values (201, 1001)
;

insert into film_actor (actor_id, film_id)
values (202, 1001)
;

select * from film_actor where film_id = 1001;

commit;

rollback;

-- 4. Add Mathmagical to the category table.

Begin transaction;

insert into category (category_id, name)
values (17, 'Mathmagical')
;

select * from category;

commit;

rollback;

-- 5. Assign the Mathmagical category to the following films, "Euclidean PI",
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"

Begin transaction;

// I added changed their category all manually. This is the last one.

insert into film_category (film_id, category_id)
values (996, 17)
;

select * from film_category where category_id = 17;

commit;

rollback;

-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films
-- accordingly.
-- (5 rows affected)

Begin transaction;

update film
set rating = 'G'
where film_id in
(select film_id from film_category where category_id =
(select category_id from category where name = 'Mathmagical'))
;

select title, rating from film
where film_id in
(select film_id from film_category where category_id =
(select category_id from category where name = 'Mathmagical'))

commit;

rollback;

-- 7. Add a copy of "Euclidean PI" to all the stores.

Begin transaction;

insert into inventory (film_id, store_id)
values (1001, 1)
;

insert into inventory (film_id, store_id)
values (1001, 2)
;

select * from inventory where film_id = 1001;

commit;

rollback;

-- 8. The Feds have stepped in and have impounded all copies of the pirated film,
-- "Euclidean PI". The film has been seized from all stores, and needs to be
-- deleted from the film table. Delete "Euclidean PI" from the film table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>

Begin transaction;

delete from film
where title = 'Euclidean PI'
;

select * from film where film_id = 1001;

commit;

rollback;

-- It did not work because the film_id exists on the film_actor table.
-- D I D  N O T  W O R K

-- 9. Delete Mathmagical from the category table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>

Begin transaction;

delete from category
where name = 'Mathmagical'
;

select * from category;

commit;

rollback;

-- It did not work because the category_id exists on the film_category table.
-- D I D  N O T  W O R K


-- 10. Delete all links to Mathmagical in the film_category tale.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>

Begin transaction;

delete from film_category
where category_id = 17
;

select * from film_category where category_id = 17;

commit;

rollback;

-- It did work.
-- And I am not entirely sure why. Is it because this is the origin of category_id?

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
-- (Did either deletes succeed? Why?)
-- <YOUR ANSWER HERE>

Begin transaction;

delete from category
where name = 'Mathmagical'
;

select * from category;

commit;

rollback;

-- It did work this time, I assume because the category_id was deleted first.


delete from film
where title = 'Euclidean PI'
;

select * from film where film_id = 1001;

commit;

rollback;

-- It still did not delete the movie title, citing that the film_id is referenced elsewhere.





------------------------------------
--    IGNORE BELOW THIS POINT     --
------------------------------------

-- 12. Check database metadata to determine all constraints of the film id, and
-- describe any remaining adjustments needed before the film "Euclidean PI" can
-- be removed from the film table.
