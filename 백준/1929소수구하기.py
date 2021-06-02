
def solution(m, n):

    lst = [True for i in range(n + 1)]

    for i in range(2, int((n + 1) ** 0.5) + 1):
        if lst[i]:
            for j in range(2 * i, n + 1, i):
                lst[j] = False

    for i in range(m, n + 1):
        if i > 1 and lst[i]:
            print(i)


if __name__ == '__main__':
    m, n = map(int, input().split())

    solution(m, n)
