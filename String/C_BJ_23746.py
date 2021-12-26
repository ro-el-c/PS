# 문자열 압축 해제

n = int(input())
rule={}
result=""

for i in range(0, n):
    temp = list(input().split(" "))
    rule[temp[1]] = temp[0]

q = input()

for i in q:
    result += rule[i]

s, e = input().split()
s = int(s)
e = int(e)
print(result[s-1:e])