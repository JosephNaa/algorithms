n, m = map(int, input().split())
val = {}

for i in range(41):
    val[i] = 0
    
for i in range(1, n+1):
    for j in range(1, m+1):
        val[i+j] += 1

max_keys = [k for k, v in val.items() if max(val.values()) == v]
max_keys.sort()

for key in max_keys:
    print(key, end=' ')