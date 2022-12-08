num1=1
while num1 <= 10:
    print(num1)
    num1=num1+1

num1=1
while num1 in range(1,11):
    print(num1)
    num1=num1+1

lst=[10,20,30,40,50,60,70,80,90,100]
idx=0
print("Accessing elements from list using While loop")
# range(0,len(lst))=(0,1,2,3,4,5,6,7,8,9)
while idx in range(0,len(lst)):
    print(lst[idx])
    idx=idx+1

Name="Pranoday"
idx=0
while idx in range(0,len(Name)):
    print(Name[idx])
    idx=idx+1

lst=[10,20,30,40,50,60,70,80,90,100]
idx=len(lst)-1
print("Printing list in reverse order using while loop")
while idx in range(0,len(lst)):
    print(lst[idx])
    idx=idx-1

