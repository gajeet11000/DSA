for __ in range(int(input())):
	x, y, a, b = list(map(int, input().split()))
	medals = 2
	if x in (a, b):
		medals -= 1
	if y in (a, b):
		medals -= 1
	print(medals)
