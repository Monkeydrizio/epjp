SELECT first_name || ' ' || last_name as "Employee Name", salary, salary*1.085 as "Salary + 8.5%", 0.085*Salary as Delta
FROM employees;

SELECT first_name || ' ' || last_name as "Employee Name"
FROM employees
WHERE REGEXP_LIKE(first_name, 'a','i') OR REGEXP_LIKE(last_name, 'a','i');

SELECT first_name || ' ' || last_name as "Employee Name", ROUND(MONTHS_BETWEEN(sysdate, hire_date), 2) as "Mesi dall'assunzione"
FROM employees;

SELECT first_name || ' ' || last_name as "Employee Name", RPAD('*',ROUND(salary/1000),'*') as Salary
FROM employees;

SELECT first_name || ' ' || last_name as "Employee Name", NVL2(commission_pct, TO_CHAR(commission_pct,'90.99'), 'no value') as Commission
FROM employees;
 