#1654 랜선 자르기
import sys
input = sys.stdin.readline

k, n = map(int, input().split())
cable=[]
hi, lo, mid = 0, 1, 0
for i in range(k):
  tmp = int(input())
  cable.append(tmp)
  if hi < tmp: hi = tmp

while(lo<=hi):
  mid = (lo + hi) // 2
  cnt = 0
  for num in cable:
    cnt += num//mid
  if cnt >= n:
    lo = mid+1
  else:
    hi = mid-1

print(hi)