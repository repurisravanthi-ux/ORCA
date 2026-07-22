n = int(input())

if n == 1:
    print(0)
elif n == 2:
    print(0, 1)
else:
    a, b = 0, 1
    result = [a, b]
    for _ in range(n - 2):
        c = a + b
        result.append(c)
        a, b = b, c
    print(*result)