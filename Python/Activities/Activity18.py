import pandas as pd
csvData = pd.read_csv("cred.csv")
print("Full CSV data - ", csvData)
print("Usernames is csv files - ", csvData["usernames"])
print("Username - ", csvData["usernames"][1], " ", "Password - ", csvData["password"][1])
print("---------Username in ascending order----") 
print(csvData.sort_values('usernames'))
print("---------Password in descending order----") 
print(csvData.sort_values('password', ascending=False))