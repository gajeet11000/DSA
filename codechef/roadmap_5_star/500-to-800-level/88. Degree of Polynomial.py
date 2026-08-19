for __ in range(int(input())):
	n = int(input())
	coeffs = list(map(int, input().split()))
	highest_degree = 0
	for i in range(n):
		coff = coeffs[i]
		if coff != 0:
			highest_degree = max(highest_degree, i)
	print(highest_degree)
