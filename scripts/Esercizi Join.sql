SELECT first_name ||' '|| last_name as "Employee Name", department_name
FROM employees left outer join departments
USING(department_id);

SELECT first_name ||' '|| last_name as "Employee Name", job_title
FROM employees left outer join jobs
USING(job_id);

SELECT e.first_name ||' '|| e.last_name as "Employee Name", e.salary
FROM employees e join jobs j
USING(job_id) -- OPPURE ON(e.job_id = j.job_id AND (e.salary = j.min_salary OR e.salary = j.max_salary));
WHERE e.salary in (j.min_salary ,j.max_salary);

SELECT e.first_name ||' '|| e.last_name as "Employee Name", l.city 
FROM employees e join departments d  ON e.department_id = d.department_id
JOIN locations l ON d.location_id = l.location_id 
WHERE country_id = 'UK';

SELECT d.department_name, e.first_name ||' '|| e.last_name as "Manager Name"
FROM departments d JOIN employees e
ON(d.manager_id = e.employee_id);

SELECT d.department_name, e.first_name ||' '|| e.last_name as "Manager Name"
FROM departments d LEFT OUTER JOIN employees e
ON(d.manager_id = e.employee_id);

SELECT department_name 
FROM departments 
WHERE manager_id is null;

SELECT e .first_name ||' '|| e.last_name as "Employee Name", m.first_name ||' '|| m.last_name as "Manager Name"
FROM employees e LEFT OUTER JOIN employees m
ON(e.manager_id = m.employee_id);

SELECT e.first_name ||' '|| e.last_name as "Employee Name", e.employee_id -- C'è un BUG!!!!
FROM employees e LEFT OUTER JOIN employees m 
ON(e.manager_id = m.employee_id)
WHERE e.employee_id NOT IN m.manager_id;











