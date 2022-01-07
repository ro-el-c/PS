# 카드2

# 덱의 양 끝 요소 추가/삭제 O(1)

from collections import deque

deque = deque([i+1 for i in range(int(input()))])

while len(deque) > 1:
    deque.popleft()
    deque.append(deque.popleft())

print(deque[0])

''' 시간 초과

# 리스트의 양 끝 요소 추가/삭제 O(n)

num = list(i+1 for i in range(int(input())))

while len(num) > 1:
    num.pop(0)
    num.append(num.pop(0))

print(num[0])
'''
