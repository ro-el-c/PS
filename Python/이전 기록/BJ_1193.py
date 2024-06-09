# 분수찾기

import sys

n = int(input())

l = []
sum = 0
for i in range(4473):
    sum += i
    l.append(sum)

for i in range(1, 4474):
    if l[i] >= n:
        r = i+1
        nth = n-l[i-1]
        break

if r % 2 != 0:
    print('{0}/{1}'.format(nth, r-nth))
else:
    print('{0}/{1}'.format(r-nth, nth))
