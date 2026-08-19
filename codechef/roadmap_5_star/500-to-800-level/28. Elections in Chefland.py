t = int(input())
while t>0:
	n, x = map(int, input().split())
	ages = list(map(int, input().split()))
	count = 0
	for i in ages:
		if i >= x:
			count += 1

	print(count)
	t -= 1
