
def solution(n):
    coin = [1, 2, 5, 7]
    lst = [n]*(n+1)

    for i in range(1, n+1):
        for c in coin:
            if c < i and lst[i-c]+lst[c] < lst[i]:
                lst[i] = lst[i-c]+lst[c]
            elif c == i:
                lst[i] = 1

    print(lst[-1])


if __name__ == '__main__':
    n = int(input())

    solution(n)