Numbers=[15,30,33,67,88,99,100]
OddNums=[]
EvenNums=[]
Even=0
Odd=0
for num in Numbers:
    if(num%2==0):
        Even=Even+1
        EvenNums.append(num)
    else:
        Odd=Odd+1
        OddNums.append(num)
print("Count of Even numbers:",Even)
print("Count of Odd numbers:",Odd)
print("Even Numbers are: ",EvenNums)
print("Even Numbers are: ",OddNums)