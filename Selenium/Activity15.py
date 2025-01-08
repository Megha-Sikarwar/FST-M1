from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.wait import WebDriverWait

with webdriver.Chrome() as driver:
    wait = WebDriverWait(driver, timeout=10)
    driver.get("https://training-support.net/webelements/dynamic-attributes")
    print(driver.title)
    driver.find_element(By.XPATH, "//input[starts-with(@id, 'full-name')]").send_keys("Megha")
    driver.find_element(By.XPATH, "//input[contains(@id, '-email')]").send_keys("megha.sikarawr@gmail.com")
    driver.find_element(By.XPATH, "//input[contains(@name, '-event-date')]").send_keys("12/12/2025")
    driver.find_element(By.XPATH, "//textarea[contains(@id, 'additional-details')]").send_keys("Please do come!!")
    driver.find_element(By.XPATH, "//button[contains(text(), 'Submit')]").click()
    wait = WebDriverWait(driver, timeout=10)
    wait.until(EC.visibility_of_element_located((By.ID, "action-confirmation")))
    print(driver.find_element(By.ID, "action-confirmation").text)
    driver.quit()