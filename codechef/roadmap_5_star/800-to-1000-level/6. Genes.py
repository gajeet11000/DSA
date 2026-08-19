a, b = list(input().split())
mapping = {
	"R": 1,
	"B": 2,
	"G": 3
}

if mapping[a] < mapping[b]:
	print(a)
else:
	print(b)
