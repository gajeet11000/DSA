t = int(input())
while t>0:
	x = int(input())
	if x-1 <= 100-x:
		print("LEFT")
	else:
		print("RIGHT")
	t -= 1