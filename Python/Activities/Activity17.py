import pandas as pd
data = {
    "usernames" : ["admin","Charles", "Deku", "Megha"],
    "password" : ["password", "Charl13", "AllMight", 'Letsdo@2025']
}
df = pd.DataFrame(data)
print(df)
df.to_csv("cred.csv")