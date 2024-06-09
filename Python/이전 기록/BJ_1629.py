import sys
a,b,c = map(int,sys.stdin.readline().split())

def result (a,b):
  if b == 1:
      return a%c
  else:
      temp = result(a, b//2)
      if b %2 ==0:
          return (temp * temp) % c
      else:
          return (temp  * temp *a) %c
          
print(result(a,b))