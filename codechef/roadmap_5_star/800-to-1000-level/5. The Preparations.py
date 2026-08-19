for __ in range(int(input())):
	m, n, k = list(map(int, input().split()))
	if n*k < m:
		print("yes")
	else:
		print("no")