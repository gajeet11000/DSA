t=int(input())
while t>0:
	x, a, b = map(int, input().split())

	if a + b*2 >= x:
		print("Qualify")
	else:
		print("NotQualify")
	t-=1