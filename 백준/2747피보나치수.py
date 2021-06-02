
def solution(data):
    a, b = 0, 1
    
    for _ in range(data):
        a, b = b, a + b

    print(a)


if __name__ == '__main__':
    data = int(input())

    solution(data)