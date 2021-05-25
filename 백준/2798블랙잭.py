def solution(n, m, cards):

    answer = 0

    for i in range(0, n):
        for j in range(i+1, n):
            for k in range(j+1, n):
                sum_3 = cards[i] + cards[j] + cards[k]
                if sum_3 <= m and sum_3 > answer:
                    answer = sum_3
    return answer


if __name__ == '__main__':
    n, m = list(map(int, input().split(' ')))
    cards = list(map(int, input().split(' ')))

    result = solution(n, m, cards)
    print(result)
