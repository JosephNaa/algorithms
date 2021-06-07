def solution(n, m, castle):

    row_count = 0
    for i in range(n):
        if "X" not in castle[i]:
            row_count += 1

    col_count = 0
    for j in range(m):
        if "X" not in [castle[i][j] for i in range(n)]:
            col_count += 1

    print(max(row_count, col_count))


if __name__ == '__main__':
    n, m = map(int, input().split())
    castle = []
    for _ in range(n):
        castle.append(input())

    solution(n, m, castle)
