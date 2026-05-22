#백만 장자 프로젝트

import sys
input = sys.stdin.readline

T = int(input())
for i in range(1, T+1):
  N = int(input()) #not used
  arr = list(map(int, input().split()))
  ans = 0
  sell_max = 0

  #for price in arr[::-1]:
  for price in reversed(arr):
    if price > sell_max:
      sell_max = price
    else:
      ans += sell_max - price

  print("#{0} {1}".format(i, ans))