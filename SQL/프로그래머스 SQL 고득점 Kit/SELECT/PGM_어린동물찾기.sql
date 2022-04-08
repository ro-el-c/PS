-- 어린 동물 찾기

SELECT animal_id, name
from animal_ins
where not (INTAKE_CONDITION = 'aged')
order by animal_id