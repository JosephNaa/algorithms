def solution(test_case):

    for _ in range(test_case):
        data = input()
        left_stack = []
        right_stack = []

        for d in data:
            if d == "<":
                if left_stack:
                    right_stack.append(left_stack.pop())
            elif d == ">":
                if right_stack:
                    left_stack.append(right_stack.pop())
            elif d == "-":
                if left_stack:
                    left_stack.pop()
            else:
                left_stack.append(d)

        left_stack.extend(reversed(right_stack))
        print(''.join(left_stack))


if __name__ == '__main__':
    test_case = int(input())

    solution(test_case)
