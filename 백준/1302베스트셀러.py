import collections


def solution(n):

    lst = list(input().rstrip() for _ in range(n))

    counter = collections.Counter(lst)

    best_count = max(counter.values())

    books = []
    for key, value in counter.items():
        if value == best_count:
            books.append(key)

    books.sort()

    print(books[0])


if __name__ == '__main__':
    n = int(input())

    solution(n)
