-- 여러 기준으로 정렬하기
SELECT animal_id, name, datetime
from animal_ins
order by name, datetime desc -- 이름 순으로 정렬, 같은 이름일 경우 보호 나중에 시작한 동물 먼저