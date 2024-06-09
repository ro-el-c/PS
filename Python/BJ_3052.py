#3052 나머지
import sys
input = sys.stdin.readline

l=[]
for i in range(10):
  l.append(int(input())%42)
ltos = set(l)
print(len(ltos))