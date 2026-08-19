for __ in range(int(input())):
	a, b = list(map(int, input().split()))
	if abs(a-b) % 2 ==0:
		print("yes")
	else:
		print("no")
