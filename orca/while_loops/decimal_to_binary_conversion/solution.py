N = int(input())

if N == 0:
    print(0)
else:
    binary = ""
    while N > 0:
        binary = str(N % 2) + binary
        N //= 2
    print(binary)