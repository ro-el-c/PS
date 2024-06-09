#2588 곱셉
import sys
input = sys.stdin.readline

a = int(input())
b = input()

print(a*int(b[2]))
print(a*int(b[1]))
print(a*int(b[0]))
print(a*int(b))

# a = int(input())
# b = int(input())

# n1 = b%10
# n2 = (b//10)%10
# n3 = b//100

# print(a*n1)
# print(a*n2)
# print(a*n3)
# print(a*b)