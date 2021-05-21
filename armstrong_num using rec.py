def digitcount(num):
    dc=0
    while num:
        num=num//10
        dc+=1
    return dc
def isarmstrong(num,dc):
    if num==0:
        return 0
    return pow(num%10,dc)+isarmstrong(num//10,dc)
num=int(input())
dc=digitcount(num)
print(num==isarmstrong(num,dc))
