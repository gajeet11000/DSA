for __ in range(int(input())):
	n, x, k = list(map(int, input().split()))
	b = k // x
	print(n if b > n else b)

