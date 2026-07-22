n_str = input().strip()
n = int(n_str)

digit_sum = sum(int(digit) for digit in n_str)

if n % digit_sum == 0:
    print("Harshad")
else:
    print("Not Harshad")