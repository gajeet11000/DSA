t = int(input())
while t>0:
	n, x = [int(x) for x in input().split()]
	subs = n // 6
	if n % 6 != 0:
		subs += 1
	print(subs * x)
	t -= 1
