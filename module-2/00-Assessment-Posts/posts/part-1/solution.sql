-- Select all columns from posts that are published

select * from posts where published = true order by created;

-- Select posted_by 
-- (Eric's note: ??. There's nothing about posted_by. I just gave you name and ID and everything.) 
-- and body from comments that have a body and were created after Oct. 15, 2019

select user_id, users.last_name, users.first_name, body, posts.created from posts inner join users on users.id = posts.user_id where body is not null and posts.created > '2019-10-15' order by created, user_id, users.last_name, users.first_name, posts.created;

-- Select the name and published states from posts ordered by when they were created, earliest first

select name, published, created from posts order by created;

-- Select the created date and the count of all the comments created on that date

select created, count(created) from posts group by created order by created;

-- Select the post name, comment posted_by and comment body for all posts created after Oct. 1st, 2019
-- (Eric's note: ??. Same as before. There's nothing about posted_by. I just gave you name and ID and everything.) 

select posts.name, user_id, users.last_name, users.first_name, posts.body, posts.created from posts inner join users on users.id = posts.user_id where body is not null and posts.created > '2019-10-1' order by posts.created, user_id, users.last_name, users.first_name, posts.created;

