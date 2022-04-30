from itertools import combinations

n, k = map(int, input().split())
lst = list(map(int, input().split()))
answer = []

perm = list(combinations(lst, 3))

for p in perm:
    answer.append(sum(p))

answer.sort(reverse=True)

print(answer[k-1])
