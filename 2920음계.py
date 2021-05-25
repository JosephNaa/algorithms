def solution(scales):

    if sorted(scales) == scales:
        answer = 'ascending'
    elif sorted(scales, reverse=True) == scales:
        answer = 'descending'
    else:
        answer = 'mixed'

    return answer


if __name__ == '__main__':
    scales = list(map(int, input().split(' ')))

    result = solution(scales)
    print(result)
