
def find(x):
    if x == parent[x]:
        return x
    else:
        p = find(parent[x])
        parent[x] = p
        return parent[x]


def union(x, y):
    x = find(x)
    y = find(y)

    if x != y:
        parent[y] = x
        number[x] += number[y]


def solution(test_case):

    for _ in range(test_case):
        global parent
        global number

        parent = dict()
        number = dict()

        f = int(input())

        for _ in range(f):
            x, y = list(input().split())

            if x not in parent:
                parent[x] = x
                number[x] = 1
            if y not in parent:
                parent[y] = y
                number[y] = 1

            union(x, y)

            print(number[find(x)])


if __name__ == '__main__':
    test_case = int(input())

    solution(test_case)
