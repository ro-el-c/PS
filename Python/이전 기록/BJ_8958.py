# OX 퀴즈
# O는 맞은 문제, X는 틀린 문제
# O가 이어지면 점수는 1씩 증가, X면 초기화
# OOXXOOO
# 1+2+0+0+1+2+3

n = int(input())

for i in range(n):
    l = list(input())
    sum = 0
    cnt = 1
    for i in range(len(l)):
        if l[i] == 'O':
            sum += cnt
            cnt += 1
        else:
            cnt = 1
    print(sum)
