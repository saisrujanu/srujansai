def seq(n):
    if n==1:
        print(n,end=" ")
        return
    print(n,end=" ")
    if n%2:
        seq(3*n+1)
    else:
        seq(n//2)
n=int(input())
seq(n)
