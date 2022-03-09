n, s = input(), input()

answer, count = 0, 0

for idx, val in enumerate(s):
    if val == 'O':
        answer, count = answer + idx + 1 + count, count + 1
    else:
        count = 0
        
            
print(answer)