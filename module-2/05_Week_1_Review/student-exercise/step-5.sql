/*
 STEP ONE: Add a new park with the following data:
  ------------------------------
  name: Ohiopyle State Park
  location: Pennsylvania
  establish date: 1965-01-01
  area: 19052
  visitors: 1000000
  description: Ohiopyle State Park is a Pennsylvania state park on 19,052 acres in Dunbar, Henry Clay and Stewart Townships, Fayette County, Pennsylvania in the United States. The focal point of the park is the more than 14 miles of the Youghiogheny River Gorge that passes through the park.
  ------------------------------
*/

begin transaction;

insert into park
(name, location, establish_date, area, visitors, description)
values('Ohiopyle State Park', 'Pennsylvania', '1965-01-01', 19052, 1000000, 'Ohiopyle State Park is a Pennsylvania state park on 19,052 acres in Dunbar, Henry Clay and Stewart Townships, Fayette County, Pennsylvania in the United States. The focal point of the park is the more than 14 miles of the Youghiogheny River Gorge that passes through the park.')
;

select * from park;

commit;

rollback;

/*
  STEP TWO: You just found out that there was an error with the park data. Please update the park visitors to 1.5 million anually.

*/

begin transaction;

update park
set visitors = 1500000
where park_id = 4
;

select * from park;

commit;

rollback;

/*
 STEP THREE: Insert new campground with the following data:
  ------------------------------------------------------------
  park_id: 4 (this should be the id of the new park you just added)
  name: Youghiogheny
  open_from_mm: 01
  open_to_mm: 12
  daily_fee: 95.00
  ------------------------------------------------------------
*/

begin transaction;

insert into campground
(park_id, name, open_from_mm, open_to_mm, daily_fee)
values(4, 'Youghiogheny', '01', '12', '95.00')
;

select * from campground where park_id = '4';

commit;

rollback;

/*
 STEP FOUR: Insert 3 new sites with the following data:
 ------------------------------------------------------------
  site_number: 623, campground_id: 8
  site_number: 624, campground_id: 8
  site_number: 625, campground_id: 8
 ------------------------------------------------------------

 > campground_id 8 should be the id of the campground you just added 'Youghiogheny'

*/

begin transaction;

insert into site
(site_number, campground_id)
values(623, 8)
;

insert into site
(site_number, campground_id)
values(624, 8)
;

insert into site
(site_number, campground_id)
values(625, 8)
;

select * from site where campground_id = 8;

commit;

rollback;

/*
 STEP FIVE: Insert 3 reservations, 1 for each site with the following data:
------------------------------------------------------------------------------------
  site_id: 623, name: Wayne Family, from_date: today + 10 days, to_date: today + 20 days
  site_id: 624, name: Parker Family, from_date: today + 11 days, to_date: today + 20 days
  site_id: 625, name: Kent Family, from_date: today + 12 days, to_date: today + 20 days
------------------------------------------------------------------------------------

*/

begin transaction;

insert into reservation
(site_id, name, from_date, to_date)
values('623', 'Wayne Family', (select (current_date + interval '10 days')), (select (current_date + interval '20 days')))
;

insert into reservation
(site_id, name, from_date, to_date)
values('624', 'Parker Family', (select (current_date + interval '11 days')), (select (current_date + interval '20 days')))
;

insert into reservation
(site_id, name, from_date, to_date)
values('625', 'Kent Family', (select (current_date + interval '12 days')), (select (current_date + interval '20 days')))
;

select * from reservation where site_id > 622;

commit;

rollback;

/*
 STEP SIX: The Wayne Family called and asked if they could change their reservation to today. Update the from_date to today and the to_date to a week from today.

 */

begin transaction;

update reservation
set from_date  = (select (current_date)), to_date = (select (current_date + interval '7 days'))
where name = 'Wayne Family'
;

select * from reservation where name = 'Wayne Family';

commit;

rollback;

/*
 STEP SEVEN: The Kent family called and they would like to cancel their reservation. Delete the reservation for Kent Family.

*/

begin transaction;

delete from reservation
where name = 'Kent Family'
;

select * from reservation where name = 'Kent Family';

commit;

rollback;