# 숫자의 개수

a = 1
for i in range(3):
    a *= int(input())

m = str(a)
arr = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]


for i in m:
    arr[int(i)] += 1

for i in range(10):
    print(arr[i])
