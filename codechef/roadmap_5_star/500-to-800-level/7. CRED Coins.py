t = int(input())
while t>0:
	x, y = map(int, input().split())
	creds = y * x
	print(creds//100)
	t -= 1
