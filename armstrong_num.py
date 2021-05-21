def isarmstrong(num):
    temp=num
    dc=0
    while temp:
        temp=temp//10
        dc+=1
    res=0
    temp=num
    while temp:
        r=temp%10
        temp=temp//10
        res+=pow(r,dc)
    if num==res:
        return True
    return False
num=int(input())
print(isarmstrong(num))
