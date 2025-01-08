from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.select import Select

with webdriver.Chrome() as driver:
    driver.get("https://training-support.net/webelements/alerts")
    print(driver.title)
    driver.find_element(By.ID, "prompt").click()
    print(driver.switch_to.alert.text)
    driver.switch_to.alert.send_keys("Awesome!!")
    driver.switch_to.alert.accept()
    print(driver.find_element(By.ID, "result").text)
    driver.quit()