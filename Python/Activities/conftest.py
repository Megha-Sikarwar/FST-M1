import pytest

@pytest.fixture
def createList():
    list = [0,1,2,3,4,5,6,7,8,9,10]
    return list

@pytest.fixture
def wallet():
    amount = 0