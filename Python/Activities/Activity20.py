import pandas

excelData = pandas.read_excel("employee.xlsx")
print(excelData)
num = excelData.shape
print("Total number of row and column in Excel is : " , num)
print("Emails available in the excel : " )
print(excelData["Email"])
print("Sorted FirstName in Ascending order : " )
print(excelData.sort_values("FirstName"))