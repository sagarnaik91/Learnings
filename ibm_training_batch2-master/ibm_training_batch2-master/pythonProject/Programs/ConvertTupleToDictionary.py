ListOfTuples=[("Name","Pranoday"),(10,"Age",),(True,"IsStudent"),(90.00,"Marks")]
Dict={}

for tup in ListOfTuples:
    K=tup[0]
    V=tup[1]
    Dict[K]=V

print(Dict)