""" 체스판 다시 칠하기 """
# M*N 크기 보드 : 어떤 정사각형 검은색, 나머지 흰색
# -> 잘라서 8*8 크기 체스판 만들 것 : 검은색, 흰색 번갈아.
# 몇 개의 정사각형 다시 칠함
# 다시 칠해야 하는 정사각형의 최소 개수
''' 브루트포스(완전탐색) 모든 경우의 수 비교, 최솟값 구하기 '''

import sys

n, m = map(int, input().split())
board = []

for i in range(n):
    board.append(sys.stdin.readline().rstrip()) # sys.stdin.readline()은 한 줄 단위로 입력 받음. 개행문자가 같이 받아짐. 문자열 타입으로 저장

min_diff = 64 # 8*8 크기의 체스판이므로 초기 최솟값을 64로 설정

for i in range(n-7):
    for j in range(m-7):   # 8*8 크기의 체스판으로 만들 수 있는 경우
        white_first=0
        black_first=0

        for a in range(i, i+8):
            for b in range(j, j+8):   # 자른 체스판의 각 자리 값 비교
                if (a+b)%2 == 0:
                    if board[a][b] != 'B':
                        black_first += 1
                    if board[a][b] != 'W':
                        white_first += 1 
                else:
                    if board[a][b] != 'B':
                        white_first += 1
                    if board[a][b] != 'W':
                        black_first += 1
        min_diff = min(min_diff, white_first, black_first)

print(min_diff)