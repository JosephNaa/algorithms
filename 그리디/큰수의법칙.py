n, m, k = list(map(int, input().split()))
data = list(map(int, input().split()))

data.sort()
count = 0
idx = 0

first = data[n-1]
second = data[n-2]

# 1
while True:
    for i in range(k):
        count += first
        idx += 1

        if idx >= m:
            break
    
    count += second
    idx += 1
    
    if idx >= m:
        break
    
print(count)

# 2
count = 0
count = int(m / (k + 1)) * k
count += m % (k + 1)

result = 0
result += count * first
result += (m - count) * second

print(result)