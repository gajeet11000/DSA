n = int(input())
divisor = 10
while divisor > 0:
	if n % divisor == 0:
		print(divisor)
		break
	divisor -= 1