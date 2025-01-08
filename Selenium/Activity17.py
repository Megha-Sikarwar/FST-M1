from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.select import Select

with webdriver.Chrome() as driver:
    driver.get("https://training-support.net/webelements/selects")
    print(driver.title)
    dropdown = driver.find_element(By.CSS_SELECTOR, "select.h-80")
    opt = Select(dropdown)
    opt.select_by_visible_text("HTML")
    print("By viisble text : " , opt.first_selected_option.text)
    for i in range(3,5) :
        opt.select_by_index(i)
    opt.select_by_value("nodejs")
    ddOptions = opt.all_selected_options
    print("-----------All Selected options are----------------")
    for ddopt in ddOptions:
        print(ddopt.text)
    opt.deselect_by_index(4)
    ddOptions = opt.all_selected_options
    print("-----------All Selected options are----------------")
    for ddopt in ddOptions:
        print(ddopt.text)
    driver.quit()