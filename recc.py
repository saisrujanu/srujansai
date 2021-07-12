"""def fun(n):
    if n==1:
        return n
    return n+fun(n-1)+fun(n-2)
n=int(input())
print(fun(n))"""


def fun(n):
    if n<=1:
        return
    
    fun(n-2)
    print(n)
    fun(n-1)
    

n=int(input())
fun(n)
        
