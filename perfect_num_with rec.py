import math as m

def isperfect (num,n):
    if n==int(m.sqrt(num)):
        if num%n==0:
            return n+num//n
        return 1
    if num%n==0:
        return n+num//n+isperfect(num,n+1)
    return 0+isperfect(num,n+1)
num=int(input())
print(num==isperfect(num,2))
