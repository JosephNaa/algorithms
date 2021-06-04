
def solution(k, lst):
    lst = sorted(lst)
    print(lst[k-1])


if __name__ == '__main__':
    n, k = map(int, input().split())
    lst = list(map(int, input().split()))

    solution(k, lst)