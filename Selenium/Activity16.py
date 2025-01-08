from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.select import Select

with webdriver.Chrome() as driver:
    driver.get("https://training-support.net/webelements/selects")
    print(driver.title)
    dropdown = driver.find_element(By.CSS_SELECTOR, "select.h-10")
    opt = Select(dropdown)
    opt.select_by_visible_text("Two")
    print("By viisble text : " , opt.first_selected_option.text)
    opt.select_by_index(3)
    print("By index text : " , opt.first_selected_option.text)
    opt.select_by_value("four")
    print("By value text : " , opt.first_selected_option.text)
    ddOptions = opt.options
    for ddopt in ddOptions:
        print(ddopt.text)
    driver.quit()