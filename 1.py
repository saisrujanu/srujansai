'''def fun(s1,s2):
    c=0
    for c in s1:
        if c in s2:
            s+=c
            count+=1
    print(count)
    return s









s1=input()
s2=input()
s=fun(s1,s2)
print(s)
'''
'''
s1 srujan
s2 srujana

srujan
'''



def fun(s1,s2):
    dic={}
    for i in s1:
        if i not in dic:
            dic[i]=1
        else:
            dic[i]+=1
    for i in s2:
        if i in dic2:
            dic2[i]+=1
        else:
            dic[i]=1
    s=''
    for i in dic1:
        if i in dic2:
            if abs(dic1[i]-dic2[i])==0:
                s+=i
        else:
            s=s+i*abs(dic1[i]-dic2[i])
print(dic1)
print(dic2)
print(s)


s1=input()
s2=input()
s=fun(s1,s2)
print(s)






























