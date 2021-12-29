while(True):
    l = list(map(int, input().split()))
    max_num = max(l)
    if sum(l) == 0:  # if max_num == 0 을 했을 때도 정답
        break
    l.remove(max_num)
    if max_num**2 == l[0]**2 + l[1]**2:
        print("right")
    else:
        print("wrong")
    
    