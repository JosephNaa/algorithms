def merge_sort(lst):
    if len(lst) <= 1:
        return lst

    mid = len(lst) // 2
    low_lst = merge_sort(lst[:mid])
    high_lst = merge_sort(lst[mid:])

    merged_lst = []

    l = h = 0

    while l < len(low_lst) and h < len(high_lst):
        if low_lst[l] < high_lst[h]:
            merged_lst.append(low_lst[l])
            l += 1
        else:
            merged_lst.append(high_lst[h])
            h += 1

    merged_lst += low_lst[l:]
    merged_lst += high_lst[h:]
    return merged_lst


def solution(n):

    lst = []

    for _ in range(n):
        data = int(input())
        lst.append(data)

    lst = merge_sort(lst)

    for l in lst:
        print(l)


if __name__ == '__main__':
    n = int(input())

    solution(n)