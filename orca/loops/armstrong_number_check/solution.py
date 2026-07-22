s = input().strip()
d = len(s)
num = int(s)

if sum(int(digit) ** d for digit in s) == num:
    print("Armstrong")
else:
    print("Not Armstrong")