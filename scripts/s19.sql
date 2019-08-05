select last_name
from employees
where last_name like '_ul%'; -- primo carattere una cosa qualunque, poi ul e poi % sta per tutti, tipo star *

select last_name
from employees
where last_name like '__d%';

select *
from regions
where region_id not in (2, 3);

-- !! NOT IN(..., NULL) -> FALSE !!
select *
from regions
where region_id not in (2, 3, null);

select *
from regions
where region_id between 2 and 3;

select *
from employees
where manager_id is null;
