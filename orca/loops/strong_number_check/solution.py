import math

n = input().strip()
num = int(n)

if sum(math.factorial(int(digit)) for digit in n) == num:
    print("Strong")
else:
    print("Not Strong")