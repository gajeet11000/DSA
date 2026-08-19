for __ in range(int(input())):
	x1, x2, y1, y2 = list(map(int, input().split()))
	car1=x1/y1
	car2=x2/y2
	if car1 > car2:
		print(-1)
	elif car2 > car1:
		print(1)
	else:
		print(0)