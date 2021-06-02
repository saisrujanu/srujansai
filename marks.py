'''def total_marks(n,data):
    data[0]=100
    print(id(data),id(n))






n=int(input())#5
data=list(map(int,input().split()))#110 100 22 33 32
total_marks(n,data)#
print(*data)'''


'''import math as m
def isprime(num):
    s=int(m.sqrt(num))
    for i in range(2,s+1):
        if num%i==0:
            return 0
    return 1

def countprimes(n,data):
    pc=0
    for i in data:
        if isprime(i):
            pc+=1
    return pc





n=int(input())
data=list(map(int,input().split()))#
pc=countprimes(n,data)#
print(pc)'''



'''
sum of list of elements
5
45 43 17 18 13
3

using functions with return value '''






import math as m
def isprime(num):
    if num==1:
        return 0
    s=int(m.sqrt(num))
    for i in range(2,s+1):
        if num%i==0:
            return 0

    return 1

def findprimes(n,data):
    prime=[]
    nonprimes=[]
    for i in data:
        if isprime(i):
            prime.append(i)
        else:
            nonprimes.append(i)
    return prime,nonprimes
    


n=int(input())
data=list(map(int,input().split()))#
primes,np=findprimes(n,data)
print(primes)
print(np)


'''
count prime numbers in the list
5
45 43 17 18 13

43 17 13

using functions with return value'''




































