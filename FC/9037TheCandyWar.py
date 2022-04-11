# 20:56

def check(n, candy):
    for i in range(n):
        if candy[i] % 2 == 1:
            candy[i] += 1
    
    return len(set(candy)) == 1

def teacher(n, candy):
    tmp_lst = [0 for i in range(n)]
    for i in range(n):
        if candy[i] % 2:
            candy[i] += 1
        candy[i] //= 2
        tmp_lst[(i+1)%n] = candy[i]
        
    for i in range(n):
        candy[i] += tmp_lst[i]
    
    return candy

def solution():
    n, candy = int(input()), list(map(int, input().split()))
    result = 0
    
    while not check(n, candy):
        result += 1
        candy = teacher(n, candy)
            
    print(result)

for i in range(int(input())):
    solution()