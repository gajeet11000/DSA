for __ in range(int(input())):
	n, a, b = list(map(int, input().split()))
	time = 0
	while n > 1:
		matches = n//2
		time += a
		time += b
		n = matches
	print(time-b)