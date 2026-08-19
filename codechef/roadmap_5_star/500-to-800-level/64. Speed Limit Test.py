for __ in range(int(input())):
	a, x, b, y = list(map(int, input().split()))
	alice_speed = a/x
	bob_speed = b/y

	if alice_speed == bob_speed:
		print("EQUAL")
	elif alice_speed > bob_speed:
		print("ALICE")
	else:
		print("BOB")
