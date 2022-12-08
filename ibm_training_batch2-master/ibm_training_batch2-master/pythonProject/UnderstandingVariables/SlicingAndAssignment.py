#Assignment updates the original list,it does not create copy
nums = [10, 20, 30, 40, 50, 60, 70, 80, 90]
nums[2]=300
print("Printing list after updating single element",nums)

#To update multiple elements from list we can use Slicing
nums = [10, 20, 30, 40, 50, 60, 70, 80, 90]
nums[:4] = [1, 2, 3, 4]
print("Printing list after updating 1st 4 elements ",nums)

#Slicing and Resizing
#If slicing returns less elements than we are using to update
#Then corresponding elements will get updated and EXTRA elements from Right Hand side
#of = will get INSERTED
nums = [10, 20, 30, 40, 50, 60, 70, 80, 90]
nums[0:4] = [1,2,3,4,5,6,7]
print(nums)

#We can replace multiple elements from list with 1 or more elements
nums = [10, 20, 30, 40, 50, 60, 70, 80, 90]
nums[:4] = [1]
print(nums)

#Replacing n-th element
nums = [10, 20, 30, 40, 50, 60, 70, 80, 90]
nums[::2]=[1,1,1,1,1]
print("Replacing every 2nd element from list with 1 ",nums)

nums = [10, 20, 30, 40, 50, 60, 70, 80, 90]
print("Printing every 2nd element ",nums[::2])

#If we try to assign list of lesser elements than on the Left hand side
#nums = [10, 20, 30, 40, 50, 60, 70, 80, 90]
#nums[::2]=[1,1,1]
#print("Having less elements on the right hand side list",nums)

listToUpdate=[]
#[1000,2000,3000,4000,5000]
nums = [10, 20, 30, 40, 50, 60, 70, 80, 90]
listToUpdate.append(1000)
listToUpdate.append(2000)
listToUpdate.append(3000)
listToUpdate.append(4000)
listToUpdate.append(5000)
nums[::2]=listToUpdate
print(nums)

#Deleting Slices
nums = [10, 20, 30, 40, 50, 60, 70, 80, 90]
print(nums)
del nums[0]
print("Deleting 1 st element",nums)

#Deleting elements starting from specific idenx and ending at specific index
nums = [10, 20, 30, 40, 50, 60, 70, 80, 90]
del nums[1:5]
print("Printing after deleting elements from Index 1 to 4",nums)

#Deleting alternate elements
nums = [10, 20, 30, 40, 50, 60, 70, 80, 90]
del nums[::2]
print("Printing after deleting Every Alternate element",nums)
