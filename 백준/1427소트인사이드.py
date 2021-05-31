def solution(data):

    lst = []

    for d in data:
        lst.append(d)

    lst.sort(reverse=True)
    print(''.join(lst))


if __name__ == '__main__':
    data = input()

    solution(data)
