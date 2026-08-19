r, o, c = list(map(int, input().split()))
overs_left = 20-o
ball_left = 6*overs_left
if c + 6*ball_left > r:
	print("yes")
else:
	print("no")

