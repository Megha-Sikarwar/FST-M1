def fibonacci(num):
    if num > 1:
        return (fibonacci(num-1) + fibonacci(num-2))
    else:
        return num
 
result = int(input("Enter a number: "))
 
for i in range(result):
    print(fibonacci(i))
