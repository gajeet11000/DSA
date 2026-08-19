t = int(input())
while t > 0:
	n = int(input())

	if n <= 10:
		print("Lower Double")
	elif n > 10 and n <= 15:
		print("Lower Single")
	elif n > 15 and n <= 25:
		print("Upper Double")
	else:
		print("Upper Single")
	t -= 1