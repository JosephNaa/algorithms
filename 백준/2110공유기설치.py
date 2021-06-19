
def solution(c, lst):
    start = 1
    end = lst[-1] - lst[0]
    result = 0

    while start <= end:
        mid = (start + end) // 2
        value = lst[0]
        count = 1

        for i in range(1, len(lst)):
            if lst[i] >= mid + value:
                value = lst[i]
                count += 1

        if count < c:
            end = mid - 1
        else:
            start = mid + 1
            result = mid

    print(result)


if __name__ == '__main__':
    n, c = map(int, input().split())
    lst = list(int(input().rstrip()) for _ in range(n))
    lst = sorted(lst)

    solution(c, lst)
