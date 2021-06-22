from collections import deque

def bfs(start, end, mid, bridge):
    deq = deque([start])
    visited = [False] * (n + 1)
    visited[start] = True
    while deq:
        x = deq.popleft()
        for y, weight in bridge[x]:
            if not visited[y] and weight >= mid:
                visited[y] = True
                deq.append(y)

    return visited[end]


def solution(n, m):
    bridge = [[] for _ in range(n+1)]

    low_weight = 1000000000
    high_weight = 1

    for _ in range(m):
        start, end, weight = map(int, input().split())
        bridge[start].append((end, weight))
        bridge[end].append((start, weight))
        low_weight = min(low_weight, weight)
        high_weight = max(high_weight, weight)

    start_island, end_island = map(int, input().split())

    result = low_weight

    while(low_weight <= high_weight):
        mid = (low_weight + high_weight) // 2
        if bfs(start_island, end_island, mid, bridge):
            result = mid
            low_weight = mid + 1
        else:
            high_weight = mid - 1


    print(result)


if __name__ == '__main__':
    n, m = map(int, input().split())

    solution(n, m)