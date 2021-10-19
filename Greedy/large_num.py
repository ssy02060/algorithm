n,m,k = map(int, input().split())

data = list(map(int,input().split()))

data.sort()

cnt = 0
result = 0
for i in range(0, m):
    if cnt < k:
        result += data[n-1]
        cnt += 1
    else:
        result += data[n-2]
        cnt = 0
print(result)