from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.wait import WebDriverWait

with webdriver.Chrome() as driver:
    wait = WebDriverWait(driver, timeout=10)
    driver.get("https://training-support.net/webelements/dynamic-content")
    print(driver.title)
    button = driver.find_element(By.ID, "genButton")
    button.click()
    if(wait.until(EC.text_to_be_present_in_element((By.ID, "word"), "release"))):
        print(driver.find_element(By.ID,"word").text)
    #driver.quit()