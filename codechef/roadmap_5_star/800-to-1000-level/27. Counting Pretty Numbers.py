for __ in range(int(input())):
	l, r = list(map(int, input().split()))
	count = 0
	for n in range(l, r+1):
		if n%10 in (2, 3, 9):
			count += 1
	print(count)