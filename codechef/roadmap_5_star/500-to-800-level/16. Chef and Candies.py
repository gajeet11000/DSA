import math
t = int(input())
while t>0:
	n, x = map(int, input().split())
	more = n - x
	more = more if more > 0 else 0
	print(math.ceil(more/4))
	t -= 1