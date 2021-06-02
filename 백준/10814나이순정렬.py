def solution(n):

    lst = []

    for _ in range(n):
        age, name = input().split(' ')
        lst.append({'age': int(age), 'name': name})

    lst.sort(key=lambda x: x['age'])

    for i in lst:
        print(i['age'], i['name'])


if __name__ == '__main__':
    n = int(input())

    solution(n)
