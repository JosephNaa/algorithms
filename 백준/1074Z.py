import sys


def solution(n, x, y):
    global result

    if not (x <= r < x + n) and not (y <= c < y + n):
        result += int(n ** 2)
        return

    if n == 2:
        if x == r and y == c:
            print(result)
            exit(0)
        result += 1

        if x == r and y + 1 == c:
            print(result)
            exit(0)
        result += 1

        if x + 1 == r and y == c:
            print(result)
            exit(0)
        result += 1

        if x + 1 == r and y + 1 == c:
            print(result)
            exit(0)
        result += 1

        print("result", result)
        return

    solution(n // 2, x, y)
    solution(n // 2, x, y + n // 2)
    solution(n // 2, x + n // 2, y)
    solution(n // 2, x + n // 2, y + n // 2)


if __name__ == '__main__':

    n, r, c = map(int, sys.stdin.readline().split())
    result = 0

    solution(2 ** n, 0, 0)
