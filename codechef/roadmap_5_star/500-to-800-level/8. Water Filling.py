t = int(input())
while t>0:
	bottles = list(map(int, input().split()))

	message = "Not now"
	empty = 0
	for b in bottles:
		if b == 0:
			empty += 1
		if empty > 1:
			message = "Water filling time"
			break
	print(message)
	t-= 1