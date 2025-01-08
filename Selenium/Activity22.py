from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.select import Select
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.wait import WebDriverWait

with webdriver.Chrome() as driver:
    wait = WebDriverWait(driver, timeout=10)
    driver.get("https://training-support.net/webelements/popups")
    print(driver.title)
    driver.find_element(By.ID, "launcher").click()
    wait.until(EC.element_to_be_clickable((By.ID, "launcher")))
    driver.find_element(By.ID, "username").send_keys("admin")
    driver.find_element(By.ID, "password").send_keys("password")
    driver.find_element(By.XPATH, "//button[text() = 'Submit']").click()
    print(driver.find_element(By.CSS_SELECTOR, "h2.font-semibold").text)
    driver.quit()