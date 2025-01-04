import pytest

def test_ListSum(list):
    sum = 0
    for l in list:
        sum += l
        print(sum)
        assert sum == 55
