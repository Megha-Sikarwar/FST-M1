import pytest

def test_ListSum(createList):
    sum = 0
    for l in createList:
        sum += l
        print(sum)
    assert sum == 55
