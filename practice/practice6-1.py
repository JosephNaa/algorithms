f = {}

n1 = ['red', 'pink', 'ivory', 'green']
n2 = ['red', 'black', 'green']
n3 = ['purple', 'green']
n4 = ['purple', 'white']
n5 = ['pink', 'ivory', 'white', 'yellow']

for n in n1:
    if not n in f:
        f[n] = ['apple']
    else:
        f[n].append('apple')
for n in n2:
    if not n in f:
        f[n] = ['strawberry']
    else:
        f[n].append('strawberry')
for n in n3:
    if not n in f:
        f[n] = ['grape']
    else:
        f[n].append('grape')
for n in n4:
    if not n in f:
        f[n] = ['blueberry']
    else:
        f[n].append('bluberry')
for n in n5:
    if not n in f:
        f[n] = ['peach']
    else:
        f[n].append('peach')
    
color = input()
print(f[color])
