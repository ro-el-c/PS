# 나머지
# 입력 받은 10개의 숫자를 42로 나눈 나머지를 구한 후,
# 그 값들 중 서로 다른 값이 몇 개인지 출력

# 집합의 성질 이용
# 리스트 : 중복 허용
# 집합 : 중복 X

arr = []

for i in range(10):
    arr.append(int(input()) % 42)

arr = list(set(arr))

print(len(arr))
