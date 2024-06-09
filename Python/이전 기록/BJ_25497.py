input()
string = input()
sk_flag = 0
lr_flag = 0
ans = 0

for data in string:
    if data == 'S':
        sk_flag += 1
    elif data == 'K':
        if sk_flag > 0:
            sk_flag -= 1
            ans += 1
        else:
            break
    elif data == 'L':
        lr_flag += 1
    elif data == 'R':
        if lr_flag > 0:
            lr_flag -= 1
            ans += 1
        else:
            break
    else:
        ans += 1

print(ans)