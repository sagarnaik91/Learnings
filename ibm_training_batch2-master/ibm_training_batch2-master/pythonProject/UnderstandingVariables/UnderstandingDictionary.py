list1=["Pranoday",10,10.0,False]
print(list1[0])


Student={"Name":"Pranoday",
        1000:"Employee Number",
        "IsEmployeed":False,
        True:"TRUE",
        90.00:"MARKS"
        }

#To access a data from Dictionary we need to use Key
print(Student["Name"])
print(Student[1000])

print("All the keys from Dictionary ",Student.keys())    #O/P:dict_keys(['Name', 1000, 'IsEmployeed', True, 90.0])

print("Printing values from Dictionary")

'''
    StudentKeys=(['Name', 1000, 'IsEmployeed'])
    With the 1 st interation of the loop we will get 'Name' in loop variable K
    Person[K] i.e. Person["Name"] i.e. we are accessing value stored against 
    key called Name which will return us value "Pranoday"

'''

StudentKeys=Student.keys()
for K in StudentKeys:
    print(Student[K])

StudentKeys=Student.keys()
print("Printing Keys 1 by 1")
for Key in StudentKeys:
    print(Key)

Person={"Name":"Pranoday",1000:"Employee Number","IsEmployeed":False,True:"TRUE",90.00:"MARKS"}
print(Person.values())  #dict_values(['Pranoday', 'Employee Number', False, 'TRUE', 'MARKS'])
PersonValues=Person.values()
for V in PersonValues:
    print(V)


PersonItems=Person.items()

'''
    PersonItems="Name":"Pranoday",
                1000:"Employee Number",
                "IsEmployeed":False,
                True:"TRUE",
                90.00:"MARKS"
'''
for K,V in PersonItems:
    print(K,end="=")
    print(V)

print("A conent of Name key before updating is ",Person["Name"])
Person["Name"]="Parag"
#print(Person["Name"])

print("A conent of Name key after updating is ",Person["Name"])

#get method accepts the key name value of which would be returned
print(Person.get(1000))
print(Person[1000])

Person={"Name":"Pranoday",1000:"Employee Number","IsEmployeed":False,True:"TRUE",90.00:"MARKS"}

#pop will remove a particular item based on key which is sent in as an argument to pop
Person.pop(True)
print(Person)

Person={"Name":"Pranoday",1000:"Employee Number","IsEmployeed":False,True:"TRUE",90.00:"MARKS"}
#popitem removes the last Key-value pair which is present in the defination of Dictionary
Person.popitem()
print(Person)

Person.clear()
print(Person)

#We can check for the existence of a particular key using in operator
#If key is present in will return boolean True else will return boolean False
Person={"Name":"Pranoday",1000:"Employee Number","IsEmployeed":False,True:"TRUE",90.00:"MARKS"}
print ("SirName" in Person.keys())
