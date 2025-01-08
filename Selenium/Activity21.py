from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.select import Select
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.wait import WebDriverWait

with webdriver.Chrome() as driver:
    wait = WebDriverWait(driver, timeout=10)
    driver.get("https://training-support.net/webelements/tabs")
    print(driver.title)
    driver.find_element(By.XPATH, "//button[text() = 'Open A New Tab']").click()
    wait.until(EC.number_of_windows_to_be(2))
    print(len(driver.window_handles))
    for window in driver.window_handles:
        driver.switch_to.window(window)
    print(driver.title)
    driver.find_element(By.XPATH, "//button[text() = 'Open Another One']").click()
    wait.until(EC.number_of_windows_to_be(3))
    print(len(driver.window_handles))
    for window in driver.window_handles:
        driver.switch_to.window(window)
    print(driver.title)
    driver.quit()