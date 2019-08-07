create table items (
item_id integer primary key,
status char,
name varchar2(20),
coder_id integer);

create table coders
as
select employee_id as coder_id, first_name, last_name, hire_date, salary
from hr.employees
where department_id = 60;

alter table coders add constraint coders_pk primary key(coder_id);

INSERT INTO coders VALUES(201, 'Maria', 'Rossi', TO_DATE(sysdate), 5000);
INSERT INTO coders VALUES (202, 'Franco', 'Bianchi', TO_DATE(sysdate), 4500);

UPDATE coders
SET first_name  = 'Mariangela'
WHERE coder_id=201;

SELECT *
FROM CODERS;

UPDATE coders
SET salary = salary +500
WHERE salary<6000;

DELETE FROM coders WHERE first_name='Franco' AND last_name='Bianchi';

commit



