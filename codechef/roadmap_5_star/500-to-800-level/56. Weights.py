def solve(w, sum, idx, weights):
	if sum == w:
		return True

	if sum > w or idx >= len(weights):
		return False

	for x in range(idx, len(weights)):
		if solve(w, sum+weights[x], x+1, weights):
			return True

	return False


for __ in range(int(input())):
	w, *weights = list(map(int, input().split()))
	if solve(w, 0, 0, weights):
		print("yes")
	else:
		print("NO")

