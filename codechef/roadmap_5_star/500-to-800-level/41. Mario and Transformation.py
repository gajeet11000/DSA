t = int(input())
while t > 0:
	x = int(input())
	pos = x % 3
	if pos == 0:
		print("normal")
	elif pos == 1:
		print("huge")
	else:
		print("small")
	t -= 1