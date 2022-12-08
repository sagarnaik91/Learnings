'''
    Function called with arbitrary arguments,accept the sent arguments in
    tuple
'''

def Addition(*Numbers):
    #print(Numbers)          #(10, 20, 30)
    #print(*Numbers)         #10 20 30
    sum=0
    if(len(Numbers)==1):
        raise ("This function can not be called with 1 argument")
    for num in Numbers:
        sum=sum+num
    return sum
#print(Addition(10))
print(Addition(10,20,30))
print(Addition(10,20))
print(Addition(10,20,30,40))
print(Addition(10,20,30,40,50,60,70,80,90,100))

