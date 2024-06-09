# 알람 시계

H, M = map(int, input().split())

if M >= 45:
    print(H, M-45)
else:
    if(H == 0):
        H = 24
    print(H-1, M+15)
