import re
import string

def MultiplicationTable(number):
    for x in range(1, 10):
        print("{} X {} = {}".format(number, x, number*2))
    return 1

def DoubleValue(number):
    return number * 2
