for __ in range(int(input())):
	a, b = list(map(int, input().split()))

	req = 21 - (a + b)

	if 1 <= req <= 10:
		print(req)
	else:
		print(-1)
