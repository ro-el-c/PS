# 과제 안 내신 분..?

data = [i for i in range(1, 31)]

for i in range(28):
    data.remove(int(input()))

data.sort()

for temp in data:
    print(temp)
