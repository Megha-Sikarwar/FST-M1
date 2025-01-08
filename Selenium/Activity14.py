from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.wait import WebDriverWait

with webdriver.Chrome() as driver:
    wait = WebDriverWait(driver, timeout=10)
    driver.get("https://training-support.net/webelements/tables")
    print(driver.title)
    rows = driver.find_elements(By.XPATH, "//table[contains(@class, 'table-auto')]/tbody/tr")
    cols = driver.find_elements(By.XPATH, "//table[contains(@class, 'table-auto')]/tbody/tr/td")
    print("Number of rows in table : ", len(rows))
    print("Number of rows in table : ", len(cols))
    cells = driver.find_element(By.XPATH, "//table[contains(@class, 'table-auto')]/tbody/tr[5]/td[2]")
    print(cells.text)
    driver.find_element(By.XPATH, "//table[contains(@class, 'table-auto')]/thead/tr/th[5]").click()
    cells = driver.find_element(By.XPATH, "//table[contains(@class, 'able-auto')]/tbody/tr[5]/td[2]")
    print(cells.text)
    driver.quit()