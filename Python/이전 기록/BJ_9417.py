# 최대 GCD
# 주어지는 수들에 대하여
# 모든 두 수의 쌍의 최대 공약수 중 최댓값 출력

from sys import stdin


def gcd(a, b):
    while(b > 0):
        a, b = b, a % b
    return a


n = int(stdin.readline())

for _ in range(n):
    l = list(map(int, stdin.readline().split()))
    ans = 1
    for i in range(len(l)-1):
        for j in range(i+1, len(l)):
            ans = max(gcd(l[i], l[j]), ans)
    print(ans)
