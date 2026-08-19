for __ in range(int(input())):
	n = int(input())
	ages = list(map(int, input().split()))
	count = 0
	for age in ages:
		if 10 <= age <= 60:
			count += 1
	print(count)
