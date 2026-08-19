t = int(input())
while t>0:
	decisions = list(map(int, input().split()))
	if any(decisions):
		print("OUT")
	else:
		print("IN")
	t -= 1