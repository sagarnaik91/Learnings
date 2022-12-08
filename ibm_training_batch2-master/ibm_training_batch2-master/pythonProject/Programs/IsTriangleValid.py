def IsTriangleValid(side1,side2,side3):
    sum=side1+side2+side3
    if(sum==180):
        print("Triangle is valid")
    else:
        print("Triangle is Invalid")

IsTriangleValid(60,60,60)
IsTriangleValid(10,20,30)
