Data=["Pranoday",10,10.0,True,"Pune","India"]

'''
        Element:    Pranoday    10  10.0    True    Pune    India
        Index:      0           1   2       3       4       5

Slicing Notation:[Start:Stop:Step]
    Start is INCLUSIVE
    Stop is EXCLUSIVE
    Step is 1 by default
'''
print("1st element from list ",Data[0])
print("1st 4 elements from list ",Data[0:4])    #['Pranoday', 10, 10.0, True]
print("3 elements from between  ",Data[2:5])    #[10.0, True, 'Pune']
print("Print the whole content of list",Data[:])#['Pranoday', 10, 10.0, True, 'Pune', 'India']
print("Print the contents of list from index 2 to END",Data[2:])#[10.0, True, 'Pune', 'India']
print("1 st 4 elements by ommitting start",Data[:4])#['Pranoday', 10, 10.0, True]
#We can use any arithmetic expression yielding integer number at Start OR Stop
print(Data[len(Data)-2:])#'Pune', 'India']

#If we try to use non-exisitng indexes then it returns BLANK list and does not give error
print(Data[8:10])

#It will print list till the last index if End is out of range,will not give any error
print(Data[1:10])

#It will start retrieving elements from Index 1 and will give every 2nd element from there
#i.e. Element at index 1,3(2nd from 1),5(2nd from 3) like that
#Data=["Pranoday",10,10.0,True,"Pune","India"]
print(Data[1::2])   #O/P:[10, True, 'India']

Data=["Pranoday",10,10.0,True,"Pune","India"]
print("Positive step",Data[::1])
#[start:stop:step] [::1] [1::2]
#Reversing the list is possible by giving Negative step
print("Reversing list using Negative step",Data[::-1])

'''
        Element:    Pranoday    10      10.0        True        Pune        India
        Index:      0           1       2           3           4           5
Negative Index:     -6          -5      -4          -3          -2          -1
'''

'''
    Step defines from a given index retrieval will go towards RIGHT hand side or towards Left-hand side
    Positive step will start the retrieval from START index and go towards RIGHT hand side
    e.g.[1:4]  starting from index 1 to index 3 as 4 is exclusive

    Negative indexing will start the retrieval from START index and go towards LEFT hand sides 

'''
Data=["Pranoday",10,10.0,True,"Pune","India"]
print(Data[2:5:1])      #[10.0,True,"Pune"]
print(Data[2:5:-1])     #[],because Index 4 is not present on the LEFT hand side of  2
print(Data[2:0:-1])     #[10.0, 10]
print(Data[2:0:1])     #[]

print("Start is BIGGER than end", Data[4:1:-1])  # O/P:['Pune', True, 10.0]
#   Pranoday    10      10.0        True        Pune        India
print(Data[2::1])
print(Data[0::3])

nums = [10, 20, 30, 40, 50, 60, 70, 80, 90]
'''
Index:      0   1   2   3   4   5   6   7   8
            10  20  30  40  50  60  70  80  90
Negative:   -9  -8  -7  -6  -5  -4  -3  -2  -1

'''
print(nums[-2::-1]) #[80, 70, 60, 50, 40, 30, 20, 10]
print(nums[-2::1])  #[80,90]
print(nums[-2:1:-1])#[80, 70, 60, 50, 40, 30]
print(nums[-2:1:1]) #[]

#Strings are nothing but list of characters so all slicing  and reversing operations we can execute on lists can
#also be executed on Strings
Name="Pranoday"
print(Name[::-1])   #yadonarP

nums = [10, 20, 30, 40, 50, 60, 70, 80, 90]
print("We can retrieve list from 0 by ommitting START ",nums[:3])

print(nums[3:])#[40, 50, 60, 70, 80, 90
print("Printing whole list is possible by ommiting both Start and Stop parameters")
print(nums[:])

nums = [10, 20, 30, 40, 50, 60, 70, 80, 90]
print(nums[-3:])#[70, 80, 90]

#Mixing Positive and Negative numbers in Slicing
print("Printing using Postive and Negative numbers in Slicing notation")
#Original List:[10, 20, 30, 40, 50, 60, 70, 80, 90]
#O/P:[20, 30, 40, 50, 60, 70, 80]
print(nums[1:-1])#[20, 30, 40, 50, 60, 70, 80, 90]

print("Printing using Negative in start and Positive in stop")
#Original List:[10, 20, 30, 40, 50, 60, 70, 80, 90]
#O/P:[70, 80]
print(nums[-3:8])#[70,80]

#Original List:[10, 20, 30, 40, 50, 60, 70, 80, 90]
#O/P:[50, 60, 70, 80]
print("Using Negative number in start as well as stop")
print(nums[-5:-1])#[50, 60, 70, 80]

#Reversing Lists
nums = [10, 20, 30, 40, 50, 60, 70, 80, 90]
print("Printing reverse list")
print(nums[::-1])#[90, 80, 70, 60, 50, 40, 30, 20, 10]

#Mentioning Negative step will access the elements from Right - Left
print("Printing using Negative Step")
print(nums[-2::-1])#[80, 70, 60, 50, 40, 30, 20, 10]

print("Printing using Positive Step")
#Postive step will access elements from Left-Right
print(nums[-2::1])#[80, 90]

#Orginal List:[10, 20, 30, 40, 50, 60, 70, 80, 90]
#O/P:[80, 70, 60, 50, 40, 30]
print("Slicing from Right-Left")
print(nums[-2:1:-1])#[80, 70, 60, 50, 40, 30]
#Count of Stop is different when Step is Positive and when it is Negative
#If step is Positive and Stop is mentioned as 4,it would stop at 3(1 less from Left)
#If step is Negative and Stop is mentioned as 4,it would stop at 5(1 less from Right)

