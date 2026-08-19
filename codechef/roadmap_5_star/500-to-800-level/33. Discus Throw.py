t = int(input())
while t>0:
	scores = list(map(int, input().split()))
	print(max(scores))
	t-=1