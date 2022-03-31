# 공약수 _ n은 2 또는 3
# pypy3로 실행

n = int(input())
li = list(map(int, input().split(" ")))

cd = []

if n == 2:
    for num in range(1, min(li[0], li[1])+1):
        if li[0] % num == 0 and li[1] % num == 0:
            cd.append(num)
else:
    for num in range(1, min(li[0], li[1], li[2])+1):
        if li[0] % num == 0 and li[1] % num == 0 and li[2] % num == 0:
            cd.append(num)

for i in cd:
    print(i)
