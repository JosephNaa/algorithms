for t in range(int(input())):
    n, s, e, k = map(int, input().split())
    lst = [i for i in input().split()]
    
    print(n, s, e, k)
    print(lst)
    slic = lst[s-1:e]
    slic.sort()
    
    print("#{} {}".format(t+1, slic[k-1]))