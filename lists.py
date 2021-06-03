
"""def min_max(n,data):
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
print(mi,ma) """

"""
min and max in a list
6
45 32 431 171 184 13 
13 431


s=45>32----->s=32>13--->s13
l=45<431--->l=431<13-->l=431

using functions with return value """









"""def findmin(n,data):
    a,mc,l=data[0],0,[]
    for i in data:
        if i==a:
            mc+=1
        if i<a:
            a=i
            mc=1
    for i in range(n):
        if data[i]==a:
            l.append(i)
    l.insert(0,a)
    l.insert(1,mc)
    return l



n=int(input())
data=list(map(int,input().split()))
minval=findmin(n,data)
print(*minval)  """







"""
min and max in a list
10
45 32 431 171 184 13 21 13 33 13



s=45>32----->s=32>13--->s13
l=45<431--->l=431<13-->l=431

using functions with return value """











def findmin(n,data):#45 32  13 431 171 184 13 21 13 33 13
    s,c=data[0],0
    for i in data:
        if s==i:
            c+=1
        if s>i:
            s=i
            c=1
    ind=[s,c]        
    for i in range(n):
        if s==data[i]:
            ind.append(i)
    return ind  








n=int(input())
data=list(map(int,input().split()))
minval=findmin(n,data)
print(*minval)







"""
min and max in a list
10
45 32 13 431 171 184 13 21 13 33 13

13 4 1 5 7 9 

using functions with return value """


































