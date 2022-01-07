# 숫자 카드 2

_ = int(input())

dic = {}

for i in map(int, input().split()):
    if i in dic:
        dic[i] += 1
    else:
        dic[i] = 1

_ = int(input())

for i in map(int, input().split()):
    if i in dic:
        print(dic[i], end=" ")
    else:
        print(0, end=" ")

'''
print(' '.join(str(dic[i]) if i in dic else '0' for i in map(
    int, input().split())))
'''
