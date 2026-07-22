n = int(input())
d = int(input())

if n == 0:
    print(1 if d == 0 else 0)
else:
    count = 0
    while n > 0:
        if n % 10 == d:
            count += 1
        n //= 10
    print(count)