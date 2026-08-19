for __ in range(int(input())):
	n, a, b = list(map(int, input().split()))
	q, r = divmod(n, 2)
	ans = a*q + b*q + b*r
	print(ans)
