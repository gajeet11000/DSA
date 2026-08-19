for _ in range(int(input())):
    n = int(input())
    found = False
    for x in range(n // 7 + 1):
        if (n - 7 * x) % 2 == 0:
            found = True
            break
    print("yes" if found else "no")
