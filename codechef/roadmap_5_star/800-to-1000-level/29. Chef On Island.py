for __ in range(int(input())):
	x, y, Xr, Yr, d = list(map(int, input().split()))
	if x/Xr >= d and y/Yr >= d:
		print("yes")
	else:
		print("no")