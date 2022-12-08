def PrintDetails(**Details):
    for Key,Value in Details.items():
        print(Key,Value)

PrintDetails(FirstName="Pranoday",RollNo=1,IsPassed=True,Marks=70.00)
PrintDetails(FirstName="Parag",RollNo=2)