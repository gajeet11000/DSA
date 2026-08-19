for __ in range(int(input())):
	x, y = list(map(int, input().split()))
	winner = max(x, y)
	loser = min(x, y)
	played_sets = x+y
	loser_needs = winner-loser
	print(played_sets+loser_needs-1)
