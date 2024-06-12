#9012 괄호
import sys
input = sys.stdin.readline

t = int(input())
isNeg = False
for i in range(t):
  st = input().rstrip()
  num = 0
  for ch in st:
    if ch == "(":
      num += 1
    else:
      num -= 1
    if num < 0:
      isNeg = True
      break
  
  if isNeg:
    print("NO")
    isNeg = False
    continue

  if num == 0:
    print("YES")
  else:
    print("NO")
