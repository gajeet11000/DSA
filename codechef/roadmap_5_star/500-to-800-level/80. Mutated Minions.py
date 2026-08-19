for __ in range(int(input())):
	n, k = list(map(int, input().split()))
	minions = list(map(int, input().split()))

	count = 0

	for mini in minions:
		if (mini+k)%7 == 0:
			count += 1
	print(count)
