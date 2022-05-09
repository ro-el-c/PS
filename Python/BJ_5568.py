import itertools

numList = []
result = []

n = int(input())
k = int(input())

for _ in range(n):
    numList.append(input())

for temp in itertools.permutations(numList, k):
    tempString = ""
    for num in temp:
        tempString += num
    if tempString not in result:
        result.append(tempString)

print(len(result))
