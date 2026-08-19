t = int(input())
while t>0:
	x, y = map(int, input().split())
	if x < y:
		print("BIKE")
	elif y < x:
		print("CAR")
	else:
		print("SAME")
	t -= 1