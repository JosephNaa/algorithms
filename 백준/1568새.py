
def solution(n):
    i = 1
    count = 0

    while n != 0:
        if i > n:
            i = 1
        n -= i
        i += 1
        count += 1
    print(count)


if __name__ == '__main__':
    n = int(input())
    solution(n)
