num=int(input())
minimum=num%10
maximum=num%10
minc=1
maxc=0
while num:
    r=num%10
    num=num//10
    
    if r==minimum:
        minc+=1
    elif r<minimum:
        minimum=r
        minc=1

        
print(minc)
       
