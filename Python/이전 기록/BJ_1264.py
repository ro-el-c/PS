vowel = ['a', 'e', 'i', 'o', 'u']
while True:
    data = input()
    if data == "#":
        break
    num=0
    for ch in data.lower():
        if ch in vowel:
            num+=1
    print(num)