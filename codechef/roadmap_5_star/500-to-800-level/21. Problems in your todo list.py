t = int(input())
while t>0:
	n = int(input())
	diff_scores = list(map(int, input().split()))
	to_remove = 0
	for i in diff_scores:
		if i >= 1000:
			to_remove += 1
	print(to_remove)
	t -= 1