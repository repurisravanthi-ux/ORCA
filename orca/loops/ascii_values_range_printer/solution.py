c1, c2 = input().split()

for i in range(ord(c1), ord(c2) + 1):
    print(f"{chr(i)}: {i}")