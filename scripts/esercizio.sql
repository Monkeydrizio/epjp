SELECT first_name, last_name, email, phone_number, hire_date
FROM employees
ORDER BY last_name asc, first_name asc;

SELECT *
FROM employees
WHERE first_name in ('Peter','David');

SELECT *
FROM employees
WHERE department_id=60;

SELECT *
FROM employees
WHERE department_id in (30, 50);

SELECT *
FROM employees
WHERE salary > 10000;

SELECT *
FROM employees
WHERE salary < 4000 OR salary > 15000;

SELECT *
FROM employees
WHERE (salary < 4000 OR salary > 15000) AND department_id in(50, 80);

SELECT *
FROM employees
WHERE TO_DATE(hire_date) BETWEEN TO_DATE('01-GEN-2005') AND TO_DATE('31-DIC-2005');

SELECT job_id
FROM employees
ORDER BY job_id asc;

SELECT *
FROM employees
WHERE commission_pct is not null;

SELECT *
FROM employees
WHERE first_name LIKE '%a%' OR last_name LIKE '%a%' OR first_name LIKE '%A%' OR last_name LIKE '%A%';

SELECT *
FROM departments
ORDER BY department_name asc;

SELECT *
FROM locations
WHERE country_id = 'IT';

SELECT *
FROM employees
WHERE first_name LIKE '%a%' AND last_name LIKE '%a%';

SELECT employee_id
FROM employees
WHERE first_name = 'Nancy' AND last_name = 'Greenberg';

SELECT *
FROM employees
WHERE manager_id = 108 ;







