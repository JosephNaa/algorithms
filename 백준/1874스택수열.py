def solution(n):

    answer = []
    stack = []
    count = 1

    for i in range(1, n + 1):
        data = int(input())
        while count <= data:
            stack.append(count)
            answer.append("+")
            count = count + 1
        if stack[-1] == data:
            stack.pop()
            answer.append("-")
        else:
            print("NO")
            return 0

    print('\n'.join(answer))


if __name__ == '__main__':
    n = int(input())

    result = solution(n)
