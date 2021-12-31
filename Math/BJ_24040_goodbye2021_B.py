# 높이 1, 부피 N
# A x B = N
# (A + B) x 2 가 3의 배수

# 시간  초과 해결
# A, B가 1, 3*k+2 일 때, 위 조건 모두 만족
# 또는 N이 9의 배수일 경우, A와 B가 모두 3의 배수가 가능하므로 만족
# 따라서 N%3 == 2 또는 N%9 == 0 이면 TAK
# 그 외의 모든 수는 NIE

T = int(input())

for i in range(T):
    a = int(input())
    if a==0:
        print("NIE")
    elif a%3 == 2 or a%9 == 0:
        print("TAK")
    else:
        print("NIE")

