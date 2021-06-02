import sys

def solution(n):
    m = 10001

    lst = [0] * m

    for _ in range(n):
        lst[int(sys.stdin.readline())] += 1

    for i in range(m):
        print(f"{i}\n"*lst[i], end="")


if __name__ == '__main__':
    n = int(sys.stdin.readline())

    solution(n)