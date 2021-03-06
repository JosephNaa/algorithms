# 파이썬 문법 정리

# 1. 자료형
## 수 자료형
### 자료형
```py
a = 1000 # 양의 정수
print(a) # 1000

a = -7 # 음의 정수
print(a) # -7

a = 0 # 0
print(a) # 0
```

### 실수형
```py
a = 157.93 # 양의 실수
print(a) # 157.93

a = -1837.2 # 음의 실수
print(a) # -1837.2

a = 5. # 소수부가 0일 때 0을 생략
print(a) # 5.0

a = -.7 # 정수부가 0일 때 0을 생략
print(a) # -0.7

a = 1e9 # 10억의 지수 표현 방식
print(a) # 1000000000.0

a = 75.25e1 # 752.5
print(a) # 752.5

a = 3954e-3 # 3.954
print(a) # 3.954

a = 0.3 + 0.6
print(a) # 0.89999999999

if a == 0.9:
    print(True)
else:
    print(False) # False

a = 0.3 + 0.6
print(rount(a, 4)) # 0.9

if round(a, 4) == 0.9:
    print(True) # True
else:
    print(False)
```

### 수 자료형의 연산
```py
a = 7
b = 3

# 나누기
print(a / b) # 2.3333333333333335

# 나머지
print(a % b) # 1

# 몫
print(a // b) # 2

# 거듭제곱
a = 5
b = 3

print(a ** b) # 125
```

## 리스트 자료형
### 리스트 만들기
```py
a = [1, 2, 3, 4, 5, 6, 7, 8, 9]
print(a) # [1, 2, 3, 4, 5, 6, 7, 8, 9]

# 인덱스 4, 즉 다섯 번째 원소에 접근
print(a[4]) # 5

# 빈 리스트 선언 방법 1)
a = list()
print(a) # []

# 빈 리스트 선언 방법 2)
a = []
print(a) # []

# 크기가 N이고, 모든 값이 0인 1차원 리스트 초기화
n = 10
a = [0] * n
print(a) # [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
```

### 리스트의 인덱싱과 슬라이싱
```py
a = [1, 2, 3, 4, 5, 6, 7, 8, 9]
# 뒤에서 첫 번째 원소 출력
print(a[-1]) # 9

# 뒤에서 세 번째 원소 출력
print(a[-3]) # 7

# 네 번째 원소 값 변경
a[3] = 7
print(a) # [1, 2, 3, 7, 5, 6, 7, 8, 9]

# 두 번째 원소부터 네 번째 원소까지
print(a[1 : 4]) # [2, 3, 4]
```

### 리스트 컴프리헨션
```py
# 0부터 19까지의 수 중에서 홀수만 포함하는 리스트
array = [i for i in range(20) if i % 2 == 1]

print(array) # [1, 3, 5, 7, 9, 11, 13, 15, 17, 19]

# 1부터 9까지의 수의 제곱 값을 포함하는 리스트
array = [i * i for i in range(1, 10)]

print(array) # [1, 4, 9, 16, 25, 36, 49, 64, 81]

# N X M 크기의 2차원 리스트 초기화
n, m = 3, 4

array[[0] * m for _ in range(n)]
print(array) # [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]

# N X M 크기의 2차원 리스트 초기화(잘못된 방법)
n, m = 3, 4
array = [[0] * m] * n
print(array) # [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]

array[1][1] = 5
print(array) # [[0, 5, 0, 0], [0, 5, 0, 0], [0, 5, 0, 0]]
```

### 리스트 관련 기타 메서드
```py
a = [1, 4, 3]
print("기본 리스트: ", a) # 기본 리스트: [1, 4, 3]

# 리스트에 원소 삽입
a.append(2)
print("삽입: ", a) # 삽입: [1, 4, 3, 2]

# 오른차순 정렬
a.sort()
print("오름차순 정렬: ", a) # 오름차순 정렬: [1, 2, 3, 4]

# 내림차순 정렬
a.sort(reverse = True)
print("내림차순 정렬: ", a) # 내림차순 정렬: [4, 3, 2, 1]

# 리스트 원소 뒤집기
a.reverse()
print("원소 뒤집기: ", a) # 원소 뒤집기: [1, 2, 3, 4]

# 특정 인덱스에 데이터 추가
a.insert(2, 3)
print("인덱스 2에 3 추가: ", a) # [1, 2, 3, 3, 4]

# 특정 값인 데이터 개수 세기
print("값이 3인 데이터 개수: ", a.count(3)) # 2

# 특정 값 데이터 삭제
a.remove(1)
print("값이 1인 데이터 삭제: ", a) # [2, 3, 3, 4]

* insert(), remove()의 시간복잡도는 O(N), append()의 시간복잡도는 O(1)이다
* insert(), remove()를 남발하면 시간초과가 발생할 수 있다

# remove 하기, remove_set에 포함되지 않은 값만 저장
a = [1, 2, 3, 4, 5, 5, 5]
remove_set = {3, 5}

result = [i for i in a if i not in remove_set]
print(reuslt) # [1, 2, 4]
```

## 문자열 자료형
### 문자열 초기화
```py
data = 'Hello World'
print(data) # Hello World

data = "Don't you know \"Python\"?" # Don't you know "Python"?
```

### 문자열 연산
```py
a = "Hello"
b = "World"
print(a + " " + b) # Hello World

a = "String"
print(a * 3) # StringStringString

a = "ABCDEF"
print(a[2 : 4]) # CD
```

## 튜플 자료형
```py
# 튜플은 한 번 선언된 값을 변경할 수 없다
# 리스트는 대괄호([])를 이용하지만, 튜플은 소괄호(())를 이용한다

a = (1, 2, 3, 4)
print(a) # (1, 2, 3, 4)

a[2] = 7 # TypeError: 'tuple' object does not support item assignment
```

## 사전 자료형
###  사전 자료형 소개
```py
data = dict()
data['사과'] = 'Apple'
data['바나나'] = 'Banana'
data['코코넛'] = 'Coconut'
print(data) # {'사과': 'Apple', '바나나': 'Banana', '코코넛': 'Coconut'}

if '사과' in data:
    print("'사과'를 키로 가지는 데이터가 존재합니다.") # '사과'를 키로 가지는 데이터가 존재합니다.
```

### 사전 자료형 관련 함수
```py
data = dict()
data['사과'] = 'Apple'
data['바나나'] = 'Banana'
data['코코넛'] = 'Coconut'

# 키 데이터만 담은 리스트
key_list = data.keys()

# 값 데이터만 담은 리스트
value_list = data.values()

print(key_list) # dict_keys(['사과', '바나나', '코코넛'])
print(value_list) # dict_values(['Apple', 'Banana', 'Coconut'])

# 각 키에 따른 값을 하나씩 출력
for key in key_list:
    print(data[key])

# Apple
# Banana
# Coconut
```

## 집합 자료형
### 집합 자료형 소개
```py
# 집합 자료형 초기화 방법 1
data = set([1, 1, 2, 3, 4, 4, 5])
print(data) # {1, 2, 3, 4, 5}

# 집합 자료형 초기화 방법 2
data = {1, 1, 2, 3, 4, 4, 5}
print(data) # {1, 2, 3, 4, 5}
```

### 집합 자료형의 연산
```py
a = set([1, 2, 3, 4, 5])
b = set([3, 4, 5, 6, 7])

# 합집합
print(a | b) # {1, 2, 3, 4, 5, 6, 7}

# 교집합
print(a & b) # {3, 4, 5}

# 차집합
print(a - b) # {1, 2}
```

### 집합 자료형 관련 함수
```py
data = set([1, 2, 3])
print(data) # {1, 2, 3}

# 새로운 원소 추가
data.add(4)
print(data) # {1, 2, 3, 4}

# 새로운 원소 여러 개 추가
data.update([5, 6])
print(data) # {1, 2, 3, 4, 5, 6}

# 특정한 값을 갖는 원소 삭제
data.remove(3)
print(data) # {1, 2, 4, 5, 6}
```

# 2. 조건문
```py
x = 15
if x >= 10:
    print(x) # 15

score = 85

if score >= 90:
    print("학점: A")
elif socre >= 80:
    print("학접: B")
elif score >= 70:
    print("학점: C")
else:
    print("학점: F") # B
```

### 비교 연산자
* == != > < >= <=

### 논리 연산자
* and or not

### 파이썬의 기타 연산자
* in 리스트, not in 문자열, pass
```py
# 조건부 표현식
score = 85
result = "Success" if score >= 80 else "Fail"
print(result) # Success

a = [1, 2, 3, 4, 5, 5, 5]
remove_set = {3, 5}

result = [i for i in a if i not in remove_set]
print(reuslt) # [1, 2, 4]

# 파이썬 내의 부동식
x = 15
if x > 0 and x < 20:
    print("x는 0 이상 20 미만의 수입니다.")

if 0 < x < 20: # 사용가능
    print("x는 0 이상 20 미만의 수입니다.")
```

# 3. 반복문
### while 문
```py
i = 1
result = 0

# i가 0보다 작거나 같을 때 아래 코드를 반복적으로 실행
while i <= 9:
    result += i
    i += 1

print(result) # 45
```

### for 문
```py
result = 0

# i는 1부터 9까지의 모든 값을 순회
for i in range(1, 10):
    result += i

print(result) # 45

# continue
scores = [90, 85, 77, 65, 97]
cheating_list = {2, 4}

for i in range(5):
    if i + 1 in cheating_list:
        continue
    if scores[i] >= 80:
        print(i + 1, "번 학생은 합격입니다")

# 2중 반복문
for i in range(2, 10):
    for j in range(1, 10):
        print(i, "X", j, "=", i * j)
    print()
```

# 4. 함수
```py
def add(a, b):
    return a + b

print(add(3, 7)) # 10

# global
a = 0

def func():
    global a
    a += 1

for i in range(10):
    func()

print(a) # 10

# 람다 표현식
def add(a, b):
    return a + b

# 일반적인 add() 메서드 사용
print(add(3, 7)) # 10

# 람다 표현식으로 구현한 add() 메서드
print((lambda a, b: a + b)(3, 7)) # 10
```

# 5. 입출력
### 입력
```py
# 데이터의 개수 입력
n = int(input())
# 각 데이터를 공백으로 구분하여 입력
data = list(map(int, input().split()))
# n, m, k를 공백으로 구분하여 입력
n, m, k = map(int, input().split())

# input() 보다 빠른 sys 라이브러리
import sys
data = sys.stdin.readline().rstrip()
print(data) # Hello World
```

### 출력
```py
a = 1
b = 2
print(a, b) # 1 2

print(a) # 1
print(b) # 2

# 출력 시 오류가 발생하는 코드
answer = 7
print("정답은 " + answer + "입니다.") # TypeError: can only concatenate str (not "int") to str

# 오류가 나지않는 코드
print("정답은 ", str(answer), "입니다.")
print("정답은 " + str(answer) + "입니다.")

# f-string
print(f"정답은 {answer}입니다.")
```

# 6. 주요 라이브러리의 문법과 유의점
### 내장 함수
```py
result = sum([1, 2, 3, 4, 5])
print(result) # 15

result = min(7, 3, 5, 2)
print(result) # 2

result = max(7, 3, 5, 2)
print(result) # 7

# eval 수학 수식이 문자열 형식으로 들어오면 해당 수식을 계산
result = eval("(3 + 5) * 7")
print(result) # 56

result = sorted([9, 1, 8, 5, 4])
print(result) # [1, 4, 5, 8, 9]
result = sorted([9, 1, 8, 5, 4], reverse = True)
print(result) # [9, 8, 5, 4, 1]

result = sorted([('홍길동', 35), ('이순신', 75), ('아무개', 50)], key = lambda x: x[1], reverse = True)
print(result) # [('이순신', 75), ('아무개', 50), ('홍길동', 35)]

data = [9, 1, 8, 5, 4]
data.sort()
print(data) # [1, 4, 5, 8, 9]
```

### itertools
```py
from itertools import permutations

data = ['A', 'B', 'C']
result = list(permutations(data, 3))
print(result) 
# [('A', 'B', 'C'), ('A', 'C', 'B'), ('B', 'A', 'C'), ('B', 'C', 'A'), ('C', 'A', 'B'), ('C', 'B', 'A')]

from itertools import combinations

data = ['A', 'B', 'C']
result = list(combinations(data, 2))
print(result)
# [('A', 'B'), ('A', 'C'), ('B', 'C')]

from itertools import product

data = ['A', 'B', 'C']
result = list(product(data, repeat=2))
print(result)
# [('A', 'A'), ('A', 'B'), ('A', 'C'), ('B', 'A'), ('B', 'B'), ('B', 'C'), ('C', 'A'), ('C', 'B'), ('C', 'C')]

from itertools import combinations_with_replacement

data = ['A', 'B', 'C']
result = list(combinations_with_replacement(data, 2))
print(result)
# [('A', 'A'), ('A', 'B'), ('A', 'C'), ('B', 'B'), ('B', 'C'), ('C', 'C')]
```

### heapq
- 다익스트라 최단 경로 알고리즘 등 우선순위 큐 기능을 구현하고자 할 때 사용
```py
# 힙 정렬
import heapq

def heapsort(iterable):
    h = []
    result = []
    
    for value in iterable:
        heapq.heappush(h, value)
        
    for i in range(len(h)):
        result.append(heapq.heappop(h))
        
    return result

result = heapsort([1, 3, 5, 7, 9, 2, 4, 6, 8, 0])
print(result)
# [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

# 최대 힙
import heapq

def heapsort(iterable):
    h = []
    result = []
    
    for value in iterable:
        heapq.heappush(h, -value)
        
    for i in range(len(h)):
        result.append(-heapq.heappop(h))
        
    return result

result = heapsort([1, 3, 5, 7, 9, 2, 4, 6, 8, 0])
print(result)
# [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]
```

### bisect
- 이진 탐색 라이브러리
- 정렬된 배열에서 특정 원소 찾기에 효과적
- 시간 복잡도 O(logN)
```py
from bisect import bisect_left, bisect_right

a = [1, 2, 4, 4, 8]
x = 4

print(bisect_left(a, x)) # 정렬된 순서를 유지하면서 리스트 a에 데이터 x를 삽입할 가장 왼쪽 인덱스를 찾는 메서드
print(bisect_right(a, x)) # 정렬된 순서를 유지하면서 리스트 a에 데이터 x를 삽입할 가작 오른쪽 인덱스를 찾는 메서드
# 2
# 4

# 범위에 속하는 데이터 개수 반환
from bisect import bisect_left, bisect_right

def count_by_range(a, left_value, right_value):
    right_index = bisect_right(a, right_value)
    left_index = bisect_left(a, left_value)
    return right_index - left_index

a = [1, 2, 3, 3, 3, 3, 4, 4, 8, 9]

# 값이 4인 데이터 개수 출력
print(count_by_range(a, 4, 4)) # 2

# 값이 [-1, 3] 범위에 있는 데이터 개수 출력
print(count_by_range(a, -1, 3)) # 6
```

### collections
- deque, Counter
```py
# deque
from collections import deque

data = deque([2, 3, 4])
data.appendleft(1)
data.append(5)

print(data) # deque([1, 2, 3, 4, 5])
print(list(data)) # [1, 2, 3, 4, 5]

# Counter
from collections import Counter

counter = Counter(['red', 'blue', 'red', 'green', 'blue', 'blue'])

print(counter['blue']) # 3
print(counter['green']) # 1
print(dict(counter)) # {'red': 2, 'blue': 3, 'green': 1}
```

### math
```py
# factorial
import math
print(math.factorial(5)) # 120

# sqrt
import math
print(math.sqrt(7)) # 2.6457513110645907

# 최대 공약수
import math
print(math.gcd(21, 14)) # 7

# 상수
import math
print(math.pi) # 3.141592653589793
print(math.e) # 2.718281828459045
```
