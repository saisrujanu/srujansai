def mul(a,b):
    if a==1:
        return b
    if a%2:
        return b+mul(a//2,b*2)
    else:
        return 0+mul(a//2,b*2)
a,b=map (int,input().split())
print(mul(a,b))
