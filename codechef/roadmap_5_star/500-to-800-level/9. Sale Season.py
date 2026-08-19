t = int(input())
while t>0:
	x = int(input())
	if x <= 100:
		pass
	elif 100 < x <= 1000:
		x -= 25
	elif 1000 < x <= 5000:
		x -= 100
	else:
		x -= 500

	print(x)

	t-=1