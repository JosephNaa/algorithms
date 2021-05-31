def solution(lst):

    lst.sort()
    for i in lst:
        print(i)


if __name__ == '__main__':
    n = int(input())
    lst = []
    for _ in range(n):
        data = int(input())
        lst.append(data)

    solution(lst)
