for __ in range(int(input())):
	p, q = list(map(int, input().split()))
	total = p + q + 1
	total = total + total%2
	if (total//2) % 2 == 1:
		print("Alice")
	else:
		print("Bob")

