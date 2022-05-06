from sympy import *

def reverse(x):
    num = str(x)
    rev = num[::-1]
    cnt = 0
    for i in range(len(rev)):
        if rev[i] == '0':
            cnt += 1
        else:
            break
    
    result = rev[cnt:]
    return int(result)
    

def isPrime(x):
    return isprime(x)

n = int(input())
lst = list(map(int, input().split()))
answer = []

for i in lst:
    num = reverse(i)
    if isPrime(num):
        answer.append(num)
        
for i in answer:
    print(i, end = ' ')