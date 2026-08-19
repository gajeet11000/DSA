import math
def isPrime(num):
	if num < 2:
		return False
	if num == 2:
		return True
		
	for factor in range(2, int(math.sqrt(num))+1):
		if num % factor == 0:
			return False
	return True

for __ in range(int(input())):
	n = int(input())
	print("yes" if isPrime(n) else "no")
