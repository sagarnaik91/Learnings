Lst=[10,20,30,40,50,5]
print("Accessing list members using for loop")

for element in Lst:
    if(element % 2==0):
        print(str(element) + " is Even number")
    else:
        print(str(element) + " is Odd number")


idx=0
print("Accessing elements from list using While loop")

while idx in range(0,len(Lst)):
    print(Lst[idx])
    idx=idx+1

Name="Pranoday"

for N in Name:
    print(N,end="")

print("Printing numbers using for loop and range function")
Numbers=range(1,11)
for num in Numbers:
    print(num)
