#2577 숫자의 개수
a = int(input())
b = int(input())
c = int(input())

l = list(str(a*b*c))
for j in range(10):
  print(l.count(str(j)))