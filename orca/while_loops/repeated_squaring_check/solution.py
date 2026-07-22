n, b = map(int, input().split())

while n > 1 and n % b == 0:
    n //= b

if n == 1:
    print("Yes")
else:
    print("No")
