n = input().strip()
num = int(n)
sq = str(num ** 2)

if sq.endswith(n) or n.endswith("0"):
    print("Automorphic")
else:
    print("Not Automorphic")