def MagicSquare(n, arr):
    sx, sy = 0, 3
    arr[sx][sy] = 1

    for i in range(2, n**2+1):
        x = sx
        y = sy

        sx -= 1
        sy -= 1

        if(sx < 0): sx = n-1
        if(sy < 0): sy = n-1

        if(arr[sx][sy] == 0):
            arr[sx][sy] = i
        else:
            sx = x + 1
            sy = y
            arr[sx][sy] = i

n = 7
arr = [ [0] * n for _ in range(n) ]

MagicSquare(n, arr)

for i in range(n):
    for j in range(n):
        print("%2d" %arr[i][j], end=" ")
    print()
