n = int(input())
answer = 0

for _ in range(n):
    dice = list(map(int, input().split()))
    dt = {}
    
    for d in dice:
        if d not in dt:
            dt[d] = 1
        else:
            dt[d] += 1
    
    sorted_dict = sorted(dt.items(), key = lambda item: item[1], reverse=True)
    
    prize = 0
    if sorted_dict[0][1] == 3:
        prize = 10000 + (1000 * sorted_dict[0][0])
    elif sorted_dict[0][1] == 2:
        store = []
        for s in sorted_dict:
            if s[1] == 2:
                store.append(s[0])
                
        prize = 1000 * max(store)
    else:
        store = []
        for s in sorted_dict:
            store.append(s[0])
                
        prize = 100 * max(store)
    
    answer = max(answer, prize)
    
print(answer)