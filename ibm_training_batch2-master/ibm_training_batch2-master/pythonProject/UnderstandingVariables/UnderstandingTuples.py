'''
    Tuples are defined using round brackets( ')' )
    Lists are defined using square brackets(']')
    Lists can be modified
    tuples can not be modified
'''

t=("Pranoday",10,10.0,True)

print("Accessing 1st element from Tuple",t[0])

for element in t:
    print(element)

print("Number of elements in tuple are ",len(t))

print("Printing tuple elements using While loop")
i=0
while i in range(0,len(t)):
    print(t[i])
    i=i+1

print("Spreading of tuples")


var1,var2,var3,var4=t
print(var1)
print(var2)
print(var3)
print(var4)

t=(10,20,30,40)
print(20 in t)
print(t.index(40))