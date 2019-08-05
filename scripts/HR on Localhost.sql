select * -- ai programmatori sql piace andare a capo dopo il select e il parametro. Lo standard è andare a capo a ogni keyword.
from regions;

select sysdate from dual;

select 4*3 from dual;

select region_name  -- colonne
from regions;

select region_id, region_name  -- non è buona norma usare *, meglio esplicitare
from regions;

select * 
from regions 
where region_id = 1; -- solo determinate righe con il comando where

select rowid, rownum
from regions;

select country_name
from countries
where country_id = 'IT';

select *
from user_tables;  -- è un pò come la reflection di java

select column_name, nullable, data_type, data_length, data_precision, data_scale
from user_tab_columns
where table_name = 'JOBS';

SELECT 10/3, 55/87, 2+6, 10*2 -- le chiavi si preferiscono in maiuscolo
FROM dual;

select to_date('30-OTT-2019') + 2, to_date('02-OTT-2019') - 3 
from dual;

select to_date('02-NOV-2019') - to_date('25-MAR-2019') 
from dual;

select job_title, min_salary, min_salary + 2000, min_salary * 3 + 1000
from jobs;

select job_title, min_salary as original, min_salary*3 " actual salary" -- as è opzionale, in questo caso doppi apici per le stringhe, solitamente sempre apice singolo in SQL
from jobs;

select first_name || ' ' || last_name as "Employee's name"
from employees;

-- Mail and salary

SELECT email || ': ' || salary || ' '|| last_name || ' ' || first_name  as "mail@salary"
FROM employees;

select first_name, last_name, commission_pct
from employees
where commission_pct is null;

select first_name, last_name, salary + 12 * salary * nvl(commission_pct, 0) as "Total Salary"
from employees;

select * 
from employees where salary between 10000 and 20000;

select * 
from employees
where salary > 20000 or last_name = 'King';

select * 
from employees
where not department_id > 20; -- fino al 20 incluso

select * 
from employees
where salary < 15000
order by last_name;

select first_name, department_name
from employees left outer join departments
using(department_id)
where last_name = 'Grant';

select first_name, last_name, department_name
from employees right outer join departments
using(department_id)
where department_id between 110 and 120;

select e.last_name, e.first_name, d.department_name
from employees e full outer join departments d
on (e.department_id = d.department_id)
where last_name = 'Grant'
or d.department_id between 110 and 120;



