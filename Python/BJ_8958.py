#8958 OX퀴즈
import sys
input = sys.stdin.readline

t = int(input())
for i in range(t):
  total_score = 0
  score = 0
  str = input()
  for ox in str:
    if ox == "O":
      score += 1
      total_score += score
    else:
      score = 0
  print(total_score)