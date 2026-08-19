for __ in range(int(input())):
	x, y = list(map(int, input().split()))
	scorex, scorey = 0, 0
	scorex += 500-2*x
	scorex += 1000-4*(x+y)

	scorey += 1000-4*y
	scorey += 500-2*(x+y)
	print(max(scorex, scorey))
