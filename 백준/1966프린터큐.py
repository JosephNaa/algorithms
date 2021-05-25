def solution(n):

    for i in range(n):
        m, location = list(map(int, input().split(' ')))
        priorities = list(map(int, input().split(' ')))

        count = 0
        priorities = [(p, idx) for idx, p in enumerate(priorities)]

        while True:
            if priorities[0][0] == max(priorities, key=lambda x: x[0])[0]:
                count += 1
                if priorities[0][1] == location:
                    print(count)
                    break
                else:
                    priorities.pop(0)
            else:
                priorities.append(priorities.pop(0))


if __name__ == '__main__':
    n = int(input())

    solution(n)
