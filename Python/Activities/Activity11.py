dict1 ={
    "Mango" : 250,
    "Orange" : 300,
    "Cherry" : 100,
    "Apple" : 280
}
print(dict1)
fruit = input("Enter any fruit name you like - ")
if (fruit in dict1):
    print("Fruit is available in dictionary")
else:
    print("Fruit is not available in dictionary")