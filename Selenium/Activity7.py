from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Chrome() as driver:
		driver.get("https://training-support.net/webelements/dynamic-controls")
		print("Web age title - " + driver.title)
		textField = driver.find_element(By.ID, "textInput")
		if(textField.is_enabled() == True):
			print("TextField is enabled")
		else:
			print("TextField is not enabled")
		driver.find_element(By.ID,"textInputButton").click()
		if(textField.is_enabled() == True):
			print("Field is enabled")
		else:
			print("Field is not enabled")
		driver.quit()