def isfib(num):
    if num==0 or num==1:
        return True
    a=0
    b=1
    while True:
        c=a+b
        if c==num:
            return True
        if c>num:
            if num-b <= c-num:
                print(b,end=" ")
            if num -b>= c-num:
                print (c)
            return False
        a=b
        b=c
num=int(input())
print(isfib(num))
