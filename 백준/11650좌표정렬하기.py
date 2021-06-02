
def solution(n):

    lst = []
    for _ in range(n):
        data = list(map(int, input().split()))
        lst.append((data[0], data[1]))

    lst.sort()
    for i in lst:
        print(i[0], i[1])


if __name__ == '__main__':
    n = int(input())

    solution(n)