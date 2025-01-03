NumList1 = list(input("Enter values for 1st list").split(","))
NumList2 = list(input("Enter values for 1st list").split(","))
NumList3 = []
for num1 in NumList1:
    if int(num1)%2 != 0:
       NumList3.append(num1)

for num2 in NumList2:
    if int(num2)%2 == 0:
        NumList3.append(num2)

print(NumList3)