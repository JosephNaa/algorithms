import copy


def makeZero(op, n):
    if len(op) == n:
        op_list.append(copy.deepcopy(op))
        return

    op.append('+')
    makeZero(op, n)
    op.pop()

    op.append('-')
    makeZero(op, n)
    op.pop()

    op.append(' ')
    makeZero(op, n)
    op.pop()


def solution(test_case):
    for _ in range(test_case):
        global op_list
        op_list = []
        data = int(input())

        makeZero([], data - 1)

        op_list.sort()

        for op in op_list:
            result = ""
            for i in range(data - 1):
                result += str(i + 1) + op[i]
            result += str(data)

            if eval(result.replace(" ", "")) == 0:
                print(result)
        print()


if __name__ == '__main__':
    test_case = int(input())

    solution(test_case)
