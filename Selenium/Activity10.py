from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver import ActionChains
with webdriver.Chrome() as driver:
    action = ActionChains(driver)
    driver.get("https://training-support.net/webelements/drag-drop")
    print("Web age title - " + driver.title)
    ele1 = driver.find_element(By.ID, "ball")
    ele2 = driver.find_element(By.ID, "dropzone1")
    ele3 = driver.find_element(By.ID, "dropzone2")
    action.click_and_hold(ele1).move_to_element(ele2).perform()
    if(driver.find_element(By.CLASS_NAME, "dropzone-text").text == "Dropped!"):
        print("Element moved to Zone1")
    action.click_and_hold(ele1).drag_and_drop(ele2,ele3).perform()
    if(driver.find_element(By.CLASS_NAME, "dropzone-text").text == "Dropped!"):
        print("Element moved to Zone2")