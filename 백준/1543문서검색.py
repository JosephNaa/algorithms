def solution(data, search):

    count = 0
    i = 0

    while i < len(data):
        if data[i:i+len(search)] == search:
            count += 1
            i += len(search)
        else:
            i += 1

    print(count)


if __name__ == '__main__':
    data = input()
    search = input()

    solution(data, search)
