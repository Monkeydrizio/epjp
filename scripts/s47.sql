select round(avg(salary)), sum(salary)
from employees
where department_id = 50;

select count(rownum) -- con rownum conto anche i null così sono sicuro di contare tutte le righe;

select max(salary), min(salary)
from employees;

select median(salary), round(stddev(salary)), round(variance(salary))
from employees;
