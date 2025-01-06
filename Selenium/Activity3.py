from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Chrome() as driver:
    driver.get("https://training-support.net/webelements/login-form/")
    print(f"title of web page is : {driver.title}")
    userField = driver.find_element(By.XPATH, "//input[@id='username']")
    passwordField = driver.find_element(By.XPATH, "//input[@id='password']")
    userField.send_keys("admin")
    passwordField.send_keys("password")
    driver.find_element(By.XPATH, "//button[text()='Submit']").click()
    print(driver.title)
    driver.quit()