from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Chrome() as driver:
    driver.get("https://training-support.net")
    print(f"title of web page is : {driver.title}")
    element = driver.find_element(By.LINK_TEXT, "About Us")
    element.click()
    driver.quit()