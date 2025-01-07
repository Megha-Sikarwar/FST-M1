from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver import ActionChains
with webdriver.Chrome() as driver:
    action = ActionChains(driver)
    driver.get("https://training-support.net/webelements/keyboard-events")
    print("Web age title - " + driver.title)
    action.send_keys("We are taking FST training").perform()
    src = driver.find_element(By.CSS_SELECTOR, "h1.mt-3")
    print("Confirmation message - " + src.text);	
    driver.quit()