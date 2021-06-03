
def min_max(n,data):
    s,l=data[0],data[0]
    for i in data:
        if s>i:
            s=i
        if l<i:
            l=i
    return s,l





n=int(input())
data=list(map(int,input().split()))
mi,ma=min_max(n,data)
print(mi,ma)

"""
min and max in a list
5
45 32 431 171 184 13
13 431


s=45>32----->s=32>13--->s13
l=45<431--->l=431<13-->l=431

using functions with return value """
