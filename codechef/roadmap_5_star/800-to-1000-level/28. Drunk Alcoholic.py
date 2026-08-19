for __ in range(int(input())):
	k = int(input())
	odds = (k + k%2) // 2
	evens = k - odds 
	forward_steps = odds*3
	backward_steps = evens
	print(forward_steps  -backward_steps)