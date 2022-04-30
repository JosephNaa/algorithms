def digit_sum(x):
    result = 0
    for num in x:
        result += int(num)
        
    return result

n = int(input())
nums = list(input().split())
answer = 0
cur_sum = 0

for num in nums:
    check_sum = digit_sum(num)
    
    if check_sum > cur_sum:
        cur_sum = check_sum
        answer = num
        
print(answer)