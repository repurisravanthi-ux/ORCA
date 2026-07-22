n = int(input())
num = 1

for i in range(1, n + 1):
    row = []
    for _ in range(i):
        row.append(num)
        num += 1
    print(*row)