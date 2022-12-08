#One important thing to notice – is that list slice creates a shallow copy of
# the initial list.
# That means, we can safely modify the new list and it will not affect the initial
# list:

nums = [10, 20, 30, 40, 50, 60, 70, 80, 90]
first_five = nums[0:5]
print("List of 1st 5 elements from original ",first_five)
print("Original List ",nums)

#Slice Object
five_items_after_second = slice(2, 6)
nums = [10, 20, 30, 40, 50, 60, 70, 80, 90]
colors = ['red', 'green', 'blue', 'yellow', 'white', 'black', 'silver']

print("Printing 1st list using Slice Object ",nums[five_items_after_second])
print("Printing 1st list using Slice Object ",colors[five_items_after_second])

#[::]
#In slice object if we want to ommit any parameter we can mention None in place
#of ommitted parameter
MyNewSlice=slice(2,None,1)

print("Using slice object with ommitting parameters ",colors[MyNewSlice])