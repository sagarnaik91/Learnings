'''

Index:          0           1      2        3       4          5            6
Element:        Pranoday    10     10.0     True    False      Prandoay     Pranoday

'''

Lst1=["Pranoday",10,10.0,True,False,"Pranoday","Pranoday"]
print(Lst1[0])
print(Lst1[3])

print("Number of elements in the list ",len(Lst1))
print("Last element from list is ",Lst1[len(Lst1)-1])
print("Index of  Last element ",len(Lst1)-1)

print("Number of times element is present in the list is ",Lst1.count("Pranoday"))

print(Lst1.index(False))

#If we try to search non-existing element in the list,it gives error
#print(Lst1.index("Dingare"))

#pop when called without any argument then removes the last element from list
print("Original List : ",Lst1)
Lst1.pop()
print("List after popping element : ",Lst1)

Lst1=["Pranoday",10,10.0,True,False,"Pranoday","Pranoday"]
#pop can also be used to remove particular element from index and it returns the element
print("Popping the element",Lst1.pop(3))
print("List after removing element from particular index: ",Lst1)
#Note:pop gives error "pop index out of range" if we try to remove element from index
#which does not exist
#Lst1.pop(10)
Lst1=["Pranoday",10,10.0,True,False,"Pranoday","Pranoday"]
#clear function clears the contents from list
print("List before clearing contents",Lst1)
Lst1.clear()
print("List after clearing contents",Lst1)
Lst1.append(10)
print("List having new content ",Lst1)
Lst1=["Pranoday",10,10.0,True,False,"Pranoday","Pranoday"]
#del operator removes the varible from the memory,hence it can not be re-used
del Lst1
#Lst1.insert(10)

Lst1=["Pranoday",10,10.0,True,False,"Pranoday","Pranoday"]
Lst1.append("Dingare")
print("List after appending ",Lst1)

Lst1=["Pranoday",10,10.0,True,False,"Pranoday","Pranoday"]
Lst1.insert(1,10000)
print("List after inserting ",Lst1)
Lst1=["Pranoday",10,10.0,True,False,"Pranoday","Pranoday"]
print("Print after inserting ",Lst1)
Lst1[0]="PRANODAY"
print("Print after updating ",Lst1)
Lst1.append(30)
print(Lst1)

'''
    Here we are copying elements from list 1 to list 2.
    Changes done in any of the list does not affect other
'''

Lst1=["Pranoday",10,10.0,True,False,"Pranoday","Pranoday"]
Lst2=Lst1.copy()
Lst2[0]="PUNE"
print("Lst1 : ",Lst1)
print("Lst2 : ",Lst2)

'''
    We are storing the reference of list in different variable.
    Both the variables point to the same memory.
    Changes done using 1 variable are seen usig another variable because changes are 
    happening at memory which is stored in these variables
'''
Lst1=["Pranoday",10,10.0,True,False,"Pranoday","Pranoday"]
Lst3=Lst1
Lst3[0]="PUNE"

print("Lst1 : ",Lst1)
print("Lst3 : ",Lst3)

Lst1=["Pranoday",10,10.0,True,False,"Pranoday","Pranoday"]
'''
    remove function takes the element to be removed as an argument.
    And it does not return anything
'''
Lst1.remove(True)
print("List after removing an element ",Lst1)

print("Return value of remove() ",Lst1.remove("Pranoday"))
print("List after removing an element ",Lst1)

print(Lst1.pop(0))
print("List after popping an element from Index 0",Lst1)