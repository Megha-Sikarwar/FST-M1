from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Chrome() as driver:
		driver.get("https://training-support.net/webelements/target-practice")
		print("Web age title - " + driver.title)
		thirdHeader = driver.find_element(By.XPATH, "//h3[text()='Heading #3']").text
		print("Text for 3rd header is : " , thirdHeader)
		fifthHeader = driver.find_element(By.XPATH, "//h5[text()='Heading #5']")
		print("Text for 5th header is : " , fifthHeader.value_of_css_property("color"))
		purpleButton = driver.find_element(By.XPATH, "//button[text()='Purple']").get_dom_attribute("class")
		print("Class name for Purple button is : ", purpleButton)
		slateButton = driver.find_element(By.XPATH, "//button[text()='Slate']").text
		print("Text for Slate button is : " + slateButton)
		driver.quit()
