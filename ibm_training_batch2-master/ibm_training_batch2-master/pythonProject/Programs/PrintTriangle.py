i=1
j=1
for i in range(1,11):
    j=i
    for j in range(1,j+1):
        print("* ",end="")
        ##print(str(j)+" ", end="")
        j=j+1
    print("\n")
    i=i+1
