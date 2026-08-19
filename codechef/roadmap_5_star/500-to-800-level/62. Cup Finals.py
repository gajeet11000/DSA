for __ in range(int(input())):
	x, y, d = list(map(int, input().split()))
	if abs(x-y) <= d:
		print("yes")
	else:
		print("no")

