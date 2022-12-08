def ContcatenateStrings(Str1,Str2,Str3="P"):
    return Str1+" "+Str3+" "+Str2

FullName=ContcatenateStrings("Pranoday","Dingare")
print(FullName)


FullName=ContcatenateStrings("Pranoday","Dingare","Pramod")
print(FullName)

lst = ['s', 'e', 'd']
print(lst)
print(*lst)


def func1(ch1,ch2,ch3):
    print(ch1)
    print(ch2)
    print(ch3)

func1(*lst)


