import pytest
import math

def test_Sum():
    num1 = 10 
    num2 = 20
    sum = num1 + num2
    print("Sum of 2 numbers is : " , sum)
    assert sum == 30

def test_Difference():
    num1 = 100 
    num2 = 20
    diff = num1 - num2
    print("Difference of 2 numbers is : " , diff)
    assert diff == 80

def test_Product():
    num1 = 10 
    num2 = 20
    prod = num1 * num2
    print("Product of 2 numbers is " , prod)
    assert prod == 200

def test_Division():
    num1 = 200 
    num2 = 20
    div = num1 / num2
    print("Quotient of 2 numbers is : ", div)
    assert div == 10