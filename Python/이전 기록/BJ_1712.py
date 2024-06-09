# 손익분기점
# A  : 고정 비용, B : 가변 비용, C : 노트북 가격

f, c, nb = map(int, input().split())

if c >= nb:
    print(-1)
else:
    print(f // (nb-c) + 1)
