def main():
    n, m, e =  map(int, input().split())
    min_line = 0
    eat_nuts = []
    nuts = []
    nuts = list(map(int, input().split()))
    print(nuts)
    for nut in nuts:
        if abs(nut - e) <= min_line:
            eat_nuts.append(nut)
        else:
            min_line+=1

        
    print(min_line)
    print(eat_nuts)
if __name__=="__main__":
    main()