from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Chrome() as driver:
		driver.get("https://training-support.net/webelements/dynamic-controls")
		print("Web age title - " + driver.title)
		checkBox = driver.find_element(By.ID, "checkbox")
		if(checkBox.is_selected() == True):
			print("Checkbox is selected")
		else:
			print("Checkbox is not selected")
		checkBox.click()
		if(checkBox.is_selected() == True):
			print("Checkbox is selected")
		else:
			print("Checkbox is not selected")
		driver.quit()