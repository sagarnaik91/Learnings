myfile=open("D:\\Pythonclass.txt","w")
myfile.write("I have learned python.")
myfile.close()

myfile=open("D:\\Pythonclass.txt","r")
print(myfile.readline())
myfile.close()