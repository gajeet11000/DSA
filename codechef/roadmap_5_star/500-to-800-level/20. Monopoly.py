t = int(input())
while t>0:
	profits = list(map(int, input().split()))
	total = sum(profits)
	monopoly = False
	for i in profits:
		if i > total-i:
			monopoly = True
			break
	print("YES" if monopoly else "NO")
	t -= 1