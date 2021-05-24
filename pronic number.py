from math import *



def ispronic(num):
    a=int(sqrt(num))
    return a*(a+1)==num
    
num=int(input())
print(ispronic(num))
