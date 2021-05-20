re=0
def rev(num):
    global re
    if num==0:
        return re
    re=re*10+num%10
    return rev(num//10)
num=int(input())
print(rev(num))
