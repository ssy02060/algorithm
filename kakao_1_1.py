n = input()
n = int(n)
arr1 = []
arr2 = []

result = []
for i in range(0, n):
    arr1.append(int(input()))

for i in range(0, n):
    arr2.append(int(input()))

for i in range(0, n):
    result.append(arr1[i] | arr2[i])
print(result)

# int to bitString
resultStrings = []
for i in range(0, n):
    resultStrings.append("")
    for j in range(0, n):
        if ((result[i] & (1 << j)) >> j) == 0:
            resultStrings[i] += " "
        else:
            resultStrings[i] += "#"
    resultStrings[i] = resultStrings[i][::-1]


print(resultStrings)
