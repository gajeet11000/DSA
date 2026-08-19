t = int(input())
while t>0:
	n = int(input())
	earned = n * 50
	earned -= (20/100*earned*2 + 30/100 * earned)
	print(int(earned))
	t -= 1