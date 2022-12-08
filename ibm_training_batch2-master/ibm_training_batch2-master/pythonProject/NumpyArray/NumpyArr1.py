import numpy
#Using list to create Numpy array
arr = numpy.array([1, 2, 3, 4, 5])

print(arr)

print(type(arr))

#Using tuple to create Numpy array
arr1 = numpy.array((1, 2, 3, 4, 5))

print(arr1)

#Its 2 D array
'''

    arr=[10,20,30,40]
    arr[0]
    arr[1]
    arr[2]

    arr=[[10,20,30],[40,50,60]]
        arr[0][0]
        arr[0][1]
        arr[0][2]

        arr[1][0]

'''
arr2 = numpy.array([[1, 2, 3], [4, 5, 6]])

print(arr2)

#ndim returns number of Dimension for Numpy array
print(arr2.ndim)

arr = numpy.array([[1, 2],[3, 4]], ndmin=2)

print(arr)
print('number of dimensions :', arr.ndim)

arr = numpy.array([1, 2, 3, 4])

print(arr[1])

#arr3[2][5]
arr3 = numpy.array([[1,2,3,4,5], [6,7,8,9,10]])

print('5th element on 1st row: ', arr3[0, 4])
print('4th element on 2nd row: ', arr3[1, 3])

#Negative Indexing
arr = numpy.array([[1,2,3,4,5], [6,7,8,9,10]])

print('Last element from 2nd dim: ', arr[1, -1])

#Slicing

arr = numpy.array([1, 2, 3, 4, 5, 6, 7])

print(arr[1:5])

#Negative Slicing
arr = numpy.array([1, 2, 3, 4, 5, 6, 7])
print(arr[-3:-1])
#STEP
arr = numpy.array([1, 2, 3, 4, 5, 6, 7])
print(arr[1:5:2])
arr = numpy.array([[1, 2, 3, 4, 5], [6, 7, 8, 9, 10]])
print(arr[1, 1:4])

# Copy is By Value
arr = numpy.array([1, 2, 3, 4, 5])
x = arr.copy()
arr[0] = 42

print(arr)
print(x)

#View is ByRef
arr = numpy.array([1, 2, 3, 4, 5])
x = arr.view()
arr[0] = 42

print(arr)
print(x)


arr = numpy.array([[1, 2, 3, 4], [5, 6, 7, 8]])

print(arr.shape)

arr = numpy.array([[1, 2, 3], [4, 5, 6]])

for x in arr:
  print(x)

arr = numpy.array([[1, 2, 3], [4, 5, 6]])

for x in arr:
  for y in x:
    print(y)

arr1 = numpy.array([1, 2, 3])

arr2 = numpy.array([4, 5, 6])

arr = numpy.concatenate((arr1, arr2))
print(arr)

arr = numpy.array([1, 2, 3, 4, 5, 6])
newarr = numpy.array_split(arr, 2)
print(newarr)

arr = numpy.array([1, 2, 3, 4, 5, 4, 4])
x = numpy.where(arr == 4)
print(x)

arr = numpy.array([3, 2, 0, 1])
print(numpy.sort(arr))
print(-numpy.sort(-arr))

arr = numpy.array([41, 42, 43, 44])
x = [True, False, True, False]
newarr = arr[x]
print(newarr)