def calculatSum(val):
    sum = 0
    for s in val:
       sum += int(s)
    return sum 
list = input("Enter List - ").split(",")

result = calculatSum(list)
print(result)
