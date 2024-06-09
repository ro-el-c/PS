# X보다 작은 수

N, X = map(int, input().split())

for i in map(int, input().split()):
    if i < X:
        print(i, end=" ")
