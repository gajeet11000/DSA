for __ in range(int(input())):
	n = int(input())
	dominations = [100, 50, 10, 5, 2, 1]

	notes = 0
	idx = 0
	while n>0:
		notes += n//dominations[idx]
		n = n % dominations[idx]
		idx += 1
	print(notes)