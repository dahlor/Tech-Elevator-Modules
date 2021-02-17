-- Droppin' tables, bro.

drop table if exists employee cascade;
drop table if exists department cascade;
drop table if exists project cascade;
drop table if exists employeeprojects cascade;
drop table if exists departmentprojects cascade;

--
-- create Employee table
--
create table employee
(
  employee_number serial not null
, job_title varchar(25) not null
, last_name varchar(25) not null
, first_name varchar(25) not null
, gender char(1) not null
, dob date not null
, doh date not null
, department_number integer not null
, constraint employee_constraint primary key(employee_number)
)
;

--
-- create Department table
--
create table department
(
  department_number serial not null
, department_name varchar(50) not null
, number_of_department_employees integer not null
, constraint department_constraint primary key(department_number)
)
;

--
-- create Project table
--
create table project
(
  project_number serial not null
, project_name varchar(25) not null
, number_of_project_employees integer not null
, constraint project_constraint primary key(project_number)
)
;

create table employeeprojects
(
 employee_number integer not null
, project_number integer not null
, constraint employeeprojects_constraint primary key(employee_number)
)
;

-- Employee Insertions

insert into employee
(job_title, last_name, first_name, gender, dob, doh, department_number)
values('Senior Producer', 'Wochna', 'Sammi', 'F', '1990-03-16', current_date, 1)
;

insert into employee
(job_title, last_name, first_name, gender, dob, doh, department_number)
values('Junior Producer', 'Lemke', 'Samantha', 'F', '1978-04-21', current_date, 1)
;

insert into employee
(job_title, last_name, first_name, gender, dob, doh, department_number)
values('Senior Marketer', 'Vanderbilt', 'Gloria', 'F', '1938-10-7', current_date, 2)
;

insert into employee
(job_title, last_name, first_name, gender, dob, doh, department_number)
values('Junior Marketer', 'Corleone', 'Vito', 'M', '1901-07-21', current_date, 2)
;

insert into employee
(job_title, last_name, first_name, gender, dob, doh, department_number)
values('Researcher', 'Montana', 'Tony', 'M', '1941-09-13', current_date, 3)
;

insert into employee
(job_title, last_name, first_name, gender, dob, doh, department_number)
values('Developer', 'Brigante', 'Carlito', 'M', '1938-11-22', current_date, 3)
;

insert into employee
(job_title, last_name, first_name, gender, dob, doh, department_number)
values('The First Backup', 'Fella', 'Frank', 'M', '1968-12-25', current_date, 4)
;

insert into employee
(job_title, last_name, first_name, gender, dob, doh, department_number)
values('The Second Backup', 'Howie', 'Jason', 'M', '1928-04-28', current_date, 4)
;

-- Department Insertions

insert into department
(department_name, number_of_department_employees)
values('Production', 2)
;

insert into department
(department_name, number_of_department_employees)
values('Marketing', 2)
;

insert into department
(department_name, number_of_department_employees)
values('Research & Development', 2)
;

insert into department
(department_name, number_of_department_employees)
values('Department of Redundancy Department', 2)
;


-- Project Insertions

insert into project
(project_name, number_of_project_employees)
values('Project North', 2)
;

insert into project
(project_name, number_of_project_employees)
values('Project South', 2)
;

insert into project
(project_name, number_of_project_employees)
values('Project East', 2)
;

insert into project
(project_name, number_of_project_employees)
values('Project West', 2)
;

-- Employeeproject Insertions

insert into employeeprojects
(employee_number, project_number)
values(1, 1)
;

insert into employeeprojects
(employee_number, project_number)
values(2, 1)
;

insert into employeeprojects
(employee_number, project_number)
values(3, 2)
;

insert into employeeprojects
(employee_number, project_number)
values(4, 2)
;

insert into employeeprojects
(employee_number, project_number)
values(5, 3)
;

insert into employeeprojects
(employee_number, project_number)
values(6, 3)
;

insert into employeeprojects
(employee_number, project_number)
values(7, 4)
;

insert into employeeprojects
(employee_number, project_number)
values(8, 4)
;

-- Setting foreign keys.

ALTER TABLE employee             -- name of dependent tables (has foreign key)
  ADD FOREIGN KEY(department_number)      -- column(s) in the dependent that comprise the foreign key
  REFERENCES department(department_number)    -- name of parent table and primary key in that table the foreign key matches to
;

ALTER TABLE employeeprojects             -- name of dependent tables (has foreign key)
  ADD FOREIGN KEY(employee_number)      -- column(s) in the dependent that comprise the foreign key
  REFERENCES employee(employee_number)    -- name of parent table and primary key in that table the foreign key matches to
;

ALTER TABLE employeeprojects             -- name of dependent tables (has foreign key)
  ADD FOREIGN KEY(project_number)      -- column(s) in the dependent that comprise the foreign key
  REFERENCES project(project_number)    -- name of parent table and primary key in that table the foreign key matches to
;