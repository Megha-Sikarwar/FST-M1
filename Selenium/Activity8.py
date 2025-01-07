from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver import ActionChains
with webdriver.Chrome() as driver:
    action = ActionChains(driver)
    driver.get("https://training-support.net/webelements/mouse-events")
    print("Web age title - " + driver.title)
    cargoLock = driver.find_element(By.XPATH, "//div/following::h1[text()='Cargo.lock']")
    cargoToml = driver.find_element(By.XPATH, "//div/following::h1[text()='Cargo.toml']")
    action.click(cargoLock).move_to_element(cargoToml).click(cargoToml).perform()
    print(driver.find_element(By.ID,"result").text)
    src = driver.find_element(By.XPATH, "//h1[text()='src']")
    target = driver.find_element(By.XPATH, "//h1[text()='target']")
    action.double_click(src).move_to_element(target).click_and_hold(target).perform()
    openButton = driver.find_element(By.XPATH,"//div[@id='menu']/div/ul/li[1]")
    action.click(openButton).perform()
    print("Confirmation message2 - " + driver.find_element(By.ID, "result").text);	
    driver.quit()