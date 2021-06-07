def solution(lst):

    count = 1
    cur = lst[0]

    for i in lst:
        if i == max(lst):
            print(count)
            break
        elif i <= cur:
            continue
        else:
            count += 1
            cur = i


if __name__ == '__main__':
    n = int(input())
    lst = list(int(input().rstrip()) for _ in range(n))

    solution(lst)
    solution(list(reversed(lst)))
