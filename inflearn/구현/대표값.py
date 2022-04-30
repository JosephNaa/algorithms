from audioop import avg


n = int(input())
answer = -1
scores = list(map(int, input().split()))
avg_score = round(sum(scores) / n)

print(avg_score, end = ' ')

while avg_score <= max(scores):
    check = scores.count(avg_score)

    if check:
        answer = scores.index(avg_score)
        break
    else:
        avg_score += 1
        
print(answer+1)