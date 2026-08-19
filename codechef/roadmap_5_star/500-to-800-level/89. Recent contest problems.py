for __ in range(int(input())):
	n = int(input())
	codes = list(input().split())
	start = 0
	ltime = 0
	for code in codes:
		if code == "START38":
			start += 1
		else:
			ltime += 1
	print(start, ltime)
