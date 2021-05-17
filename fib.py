def gen_fib(n):
    if n==0:
        return
    if n==1:
        print(0)
        return
    a,b=0,1
    print(a,b,end=" ")
    for i in range (3,n+1):
        c=a+b
        print (c,end=" ")
        a=b
        b=c
n=int(input())
gen_fib(n)
