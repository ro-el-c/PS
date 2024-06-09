# 종이자르기

b, a = map(int, input().split())
cut = int(input())

row = [0, a]
col = [0, b]

for _ in range(cut):
    what, num = map(int, input().split())
    if what == 0:
        row.append(num)
    else:
        col.append(num)

row.sort()
col.sort()

max_h = 0
max_w = 0

for i in range(1, len(row)):
    max_h = max(max_h, row[i]-row[i-1])

for i in range(1, len(col)):
    max_w = max(max_w, col[i]-col[i-1])

print(max_h * max_w)
