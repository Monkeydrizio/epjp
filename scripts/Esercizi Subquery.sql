SELECT MAX(salary) as "Max Salary", MIN(salary) as "Min Salary", SUM(salary) as "Total Salary", AVG(salary) as "Average Salary"
FROM employees;

SELECT job_id, MAX(salary) as "Max Salary", MIN(salary) as "Min Salary", SUM(salary) as "Total Salary", AVG(salary) as "Average Salary"
FROM employees
GROUP BY job_id
ORDER BY 5 desc;

SELECT job_id, COUNT(employee_id) as "Numero dipendenti"
FROM employees
GROUP BY job_id
ORDER BY 2 desc;

SELECT job_id, COUNT(employee_id) as "Numero dipendenti"
FROM employees
GROUP BY job_id
HAVING job_id = 'IT_PROG';

SELECT COUNT(DISTINCT manager_id)
FROM employees;

SELECT (MAX(salary)-MIN(salary)) as "DELTA SALARY"
FROM employees;

SELECT job_id, (MAX(salary)-MIN(salary)) as "DELTA SALARY"
FROM employees
GROUP BY job_id
HAVING (MAX(salary)-MIN(salary))>0;

SELECT manager_id, MIN(salary) as "Min Salary"
FROM employees
GROUP BY manager_id
HAVING MIN(salary)>= 6000 AND manager_id IS NOT null;

SELECT country_name, street_address, postal_code, city, state_province
FROM countries JOIN locations
USING (country_id);

SELECT first_name || last_name as "Employee Name", department_name
FROM employees JOIN departments
USING (department_id);

SELECT e.first_name || e. last_name as "Employee Name", d.department_name, l.city
FROM employees e JOIN departments d ON e.department_id=d.department_id 
JOIN locations l ON  d.location_id=l.location_id
WHERE l.city = 'Toronto';

SELECT first_name ||' '|| last_name as "Employee Name"
FROM employees
WHERE TO_DATE(hire_date) > TO_DATE((SELECT hire_date FROM employees WHERE first_name = 'David' AND last_name = 'Lee')); 

SELECT e.first_name ||' '|| e.last_name as "Employee Name"
FROM employees e JOIN employees m ON e.manager_id = m.employee_id
WHERE e.hire_date < m.hire_date;

SELECT first_name ||' '|| last_name as "Employee Name"
FROM employees
WHERE manager_id = (SELECT manager_id FROM employees WHERE first_name = 'Lisa' AND last_name = 'Ozer'); 

SELECT first_name ||' '|| last_name as "Employee Name"
FROM employees
WHERE department_id IN (SELECT DISTINCT d.department_id FROM employees e JOIN employees d ON e.department_id = d.department_id WHERE REGEXP_LIKE(e.last_name, 'u','i'));

SELECT first_name ||' '|| last_name as "Employee Name"
FROM employees
WHERE department_id = (SELECT department_id FROM departments WHERE department_name = 'Shipping');

SELECT first_name ||' '|| last_name as "Employee Name"
FROM employees
WHERE manager_id = (SELECT employee_id FROM employees WHERE first_name = 'Steven' AND last_name='King');
