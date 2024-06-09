# Greedily Increasing Subsequence

cnt=1
n = int(input())
num = list(map(int, input().split()))
temp = num[0]
s = str(num[0]) + " "

for i in range(1, n):
    if(num[i] > temp):
        temp = num[i]
        s += str(num[i]) + " "
        cnt += 1

s = s.strip()
print(cnt)
print(s)