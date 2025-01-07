from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Chrome() as driver:
		driver.get("https://training-support.net/webelements/dynamic-controls")
		print("Web age title - " + driver.title)
		checkBox = driver.find_element(By.ID, "checkbox")
		if(checkBox.is_displayed() == True):
			print("Checkbox is displayed")
		else:
			print("Checkbox is not displayed")
			
		toggle = driver.find_element(By.XPATH, "//button[text()='Toggle Checkbox']")
		toggle.click()
		if(checkBox.is_displayed() == True):
			print("Checkbox is displayed")
		else:
			print("Checkbox is not displayed")
		driver.quit()