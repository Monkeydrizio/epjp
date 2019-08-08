-- CREO LA PROCEDURA TOMORROW

create or replace procedure tomorrow is
begin
dbms_output.put_line(sysdate +1);
end tomorrow;
/

-- ATTIVO LA PROCEDURA

BEGIN
tomorrow;
END;
/

-- TOMORROW CON NOME

create or replace procedure tomorrow_name (
p_name in VARCHAR2)is
begin
dbms_output.put_line(sysdate +1 ||' '||p_name);
end tomorrow_name;

DECLARE
v_name VARCHAR2(20) := 'M';
BEGIN
tomorrow_name(v_name);
END;
/

-- GET CODER

create or replace procedure get_coder(
p_coder_id in INTEGER,
p_coder_name out VARCHAR2)as
BEGIN
select first_name ||' '|| last_name
into p_coder_name
from coders
where coder_id = p_coder_id;
END get_coder;
/


DECLARE
v_coder_id INTEGER := 105;
v_coder_name VARCHAR2(30);
BEGIN
get_coder(v_coder_id, v_coder_Name);
dbms_output.put_line(v_coder_Name);
end;
/

-- GET CODER2

create or replace procedure get_coder2(
p_coder_id in INTEGER,
p_coder_name out VARCHAR2,
p_coder_surname out VARCHAR2)as
BEGIN
select first_name, last_name
into p_coder_name, p_coder_surname
from coders
where coder_id = p_coder_id;
END get_coder2;
/


DECLARE
v_coder_id INTEGER := 103;
v_coder_name VARCHAR2(15);
v_coder_surname VARCHAR2(15);
BEGIN
get_coder2(v_coder_id, v_coder_name, v_coder_surname);
dbms_output.put_line(v_coder_name ||' ' || v_coder_surname);
end;
/

-- FUNZIONE N GIORNI DOPO OGGI

create or replace function n_days_after(
p_n in integer)
return date as
v_days_after date;
BEGIN
v_days_after := sysdate + p_n;
return v_days_after;
END n_days_after;
/

DECLARE
v_n integer := 72;
v_days_after date;
BEGIN
v_days_after := n_days_after(v_n);
dbms_output.put_line('In'||' '||v_n||' '||'days, the date will be '||v_days_after);
END;
/

-- FUNZIONE N GIORNI DOPO IL GIORNO CHE PASSO ALLA FUNZIONE

create or replace function n_days_after2(
p_n in integer,
p_date in date)
return date as
v_days_after date;
BEGIN
v_days_after := p_date + p_n;
return v_days_after;
END n_days_after2;
/

DECLARE
v_n integer := 10;
v_date date := TO_DATE('10-AGO-19');
v_days_after date;
BEGIN
v_days_after := n_days_after2(v_n, v_date);
dbms_output.put_line('In'||' '||v_n||' '||'days from'||' '|| v_date || ' the date will be '||v_days_after);
END;
/