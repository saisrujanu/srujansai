def fibi(a,b,i,num):
    if i>num:
        return
    if i==1:
        print(a,end=" ")
        i+=1
    if i==2:
        print(b,end=" ")
        i+=1
    if i<=num:
        print(a+b,end=" ")

    fibi(b,a+b,i+1,num)
num=int(input())
fibi(0,1,1,num)
    
