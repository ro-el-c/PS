# 번데기

# 브루트포스

# 일구: 0번쨰
A = int(input())
T = int(input())
what = int(input())  # 0: 뻔, 1: 데기

list = []
bbun_0 = 0
degi_1 = 0
turn = 0

while 1:
    turn += 1

    for _ in range(2):
        bbun_0 += 1
        degi_1 += 1
        list.append((0, bbun_0))
        list.append((1, degi_1))

    for _ in range(turn+1):
        bbun_0 += 1
        list.append((0, bbun_0))

    for _ in range(turn+1):
        degi_1 += 1
        list.append((1, degi_1))

    if bbun_0 >= T:
        print(list.index((what, T)) % A)
        break


'''
    4 2 2
    4 3 3
    4 4 4

    4
    5
    6

    뻔 데기 뻔 데기 뻔 뻔 데기 데기
    뻔 데기 뻔 데기 뻔 뻔 뻔 데기 데기 데기
    뻔 데기 뻔 데기 뻔 뻔 뻔 뻔 데기 데기 데기 데기

sum = 0
all = 0
for i in range(4, ):
    turn = i-3

    all += 2*i
    sum += i

    if sum >= T:
        temp = T - (sum - i)

        all -= 2*i

        if temp == 1:
            if what == 0:
                all += 1
            elif what == 1:
                all += 2
        elif temp == 2:
            if what == 0:
                all += 3
            elif what == 1:
                all += 4
        elif temp > 2:
            if what == 0:
                all += temp + 2
            elif what == 1:
                all += temp + turn + 3

print((all-1) % A)'''
