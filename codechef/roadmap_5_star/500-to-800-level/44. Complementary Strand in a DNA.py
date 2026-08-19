t = int(input())
while t > 0:
	n = int(input())
	nucleos = list(input())
	for i, ch in enumerate(nucleos):
		if ch == "A":
			nucleos[i] = "T"
		elif ch == "T":
			nucleos[i] = "A"
		elif ch == "G":
			nucleos = "C"
		else:
			nucleos = "G"
	return "".join(nucleos)
	t -= 1