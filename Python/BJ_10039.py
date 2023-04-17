# 평균 점수
sum=0

for _ in range(5):
    temp = int(input())
    if temp < 40:
        sum += 40
    else:
        sum += temp

print(sum//5)