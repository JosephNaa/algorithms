a, b = map(int, input().split())
c = int(input())

if b + c >= 60:
    temp = b + c
    while temp >= 60:
        if a == 23:
            a = 0
        else:
            a += 1
        temp -= 60
    sum = temp
else:
    sum = b + c
print(a, sum)
