import math
for __ in range(int(input())):
	x, y = list(map(int, input().split()))
	need = abs(x-y)
	ans = math.ceil((math.sqrt(8*need+1) -1)/2)
	print(int(ans))
