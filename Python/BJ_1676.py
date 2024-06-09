#1676 팩토리얼 0의 개수
import sys
input = sys.stdin.readline
n = int(input())
tn = 1
for i in range(1, n+1):
  tn *= i
cnt=0
for i in range(len(str(tn))-1, -1, -1):
  if int(str(tn)[i]) == 0:
    cnt+=1
  else:
    print(cnt)
    sys.exit()