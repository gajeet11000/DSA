for __ in range(int(input())):
	x = int(input())
	if x % 5 != 0:
		print(-1)
	else:
		q, r = divmod(x, 10)
		print(q + (1 if r!=0 else 0))