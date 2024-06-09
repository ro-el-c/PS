#15552 빠른 A+B
import sys
input = sys.stdin.readline

t = int(input())

while(t):
  t -= 1
  a, b = map(int, input().split())
  print(a + b)