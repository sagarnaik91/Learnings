start=1000
DivisbleBy3=[]
MultiplesOf10=[]
Both=[]
while start in range(start,3001):
    if(start%3==0):
        DivisbleBy3.append(start)
    if(start%10==0):
        MultiplesOf10.append(start)
    if(start%3==0 and start%10==0):
        Both.append(start)
    start=start+1
print("List of numbers which are Divisible By 3 ",DivisbleBy3)
print("List of numbers which are multiples of 10 ",MultiplesOf10)
print("List of numbers which are BOTH ",Both)