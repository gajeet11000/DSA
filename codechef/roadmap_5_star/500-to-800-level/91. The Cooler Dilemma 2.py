for __ in range(int(input())):
	x, y = list(map(int, input().split()))
	months = y // x

	if y % x == 0:
		months -= 1

	print(months)
