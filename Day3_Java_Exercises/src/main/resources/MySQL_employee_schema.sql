create schema if not exists employee;
use employee;

create table if not exists employee (
	employee_id int(11) not null auto_increment primary key,
    first_name varchar(50) not null,
    last_name varchar(50) not null,
    email varchar(75) not null,
    phone_number varchar(50) not null,
    hire_date date not null,
    job_id varchar(50) not null,
    salary float not null,
    commission_pct decimal(5,2),
    manager_id int(11) not null,
    department_id int(11) not null
);
