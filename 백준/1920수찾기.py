
def solution(n_data, m_data):

    for i in m_data:
        if i in n_data:
            print(1)
        else:
            print(0)


if __name__ == '__main__':
    n = int(input())
    n_data = set(map(int, input().split()))

    m = int(input())
    m_data = list(map(int, input().split()))

    solution(n_data, m_data)