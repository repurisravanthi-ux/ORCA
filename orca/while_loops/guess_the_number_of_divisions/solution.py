n = int(input())
count = 0

while n > 0:
    n //= 2
    count += 1

print(count)