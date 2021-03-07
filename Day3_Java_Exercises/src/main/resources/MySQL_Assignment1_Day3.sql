-- PRACTICE QUERIES

-- 1. Created table in MySQL (see MySQL_employee_schema.sql)

-- 2. Write a query to display the names (first_name, last_name) using alias names “First Name", "Last Name"
SELECT first_name AS "First Name", last_name AS "Last Name" FROM employee;

-- 3. Write a query to get unique department ID from employee table
SELECT DISTINCT department_id FROM employee;

-- 4. Find the total number of employees in the table
SELECT COUNT(employee_id) FROM employee;

-- 5. Write a query to display the number avg salary of all employees
SELECT AVG(salary) FROM employee;

-- 6. Write a query to display the number avg salary of all employees from each department
SELECT AVG(salary) FROM employee GROUP BY department_id;

-- 7. Write a query to display the number sum salary of all employees
SELECT SUM(salary) FROM employee;

-- 8. Write a query to display the number sum salary of all employees from each department
SELECT SUM(salary) FROM employee GROUP BY department_id;

-- 9. Write a query to display all the employes with last name being sort in descending order
SELECT * FROM employee ORDER BY last_name DESC;

-- 10. Write a query to display all the employees that have character e in their first name
SELECT * FROM employee WHERE first_name LIKE '%e%';
