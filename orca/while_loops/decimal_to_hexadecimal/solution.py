n = int(input())

if n == 0:
    print("0")
else:
    hex_digits = "0123456789ABCDEF"
    result = ""
    while n > 0:
        remainder = n % 16
        result = hex_digits[remainder] + result
        n //= 16
    print(result)