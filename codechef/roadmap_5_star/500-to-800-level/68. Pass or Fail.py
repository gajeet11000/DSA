for __ in range(int(input())):
	n, x, p = list(map(int, input().split()))
	total_score = 3*x - (n-x)
	if total_score >= p:
		print("PASS")
	else:
		print("FAIL")

