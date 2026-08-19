for __ in range(int(input())):
	n = int(input())
	ori = n
	rev = 0
	while n>0:
		rev *= 10
		rev += n%10
		n = n//10
	print("wins" if ori == rev else "loses")

