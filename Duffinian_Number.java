package prgs5;
import java.util.*;
public class Duffinian_Number {
static int sum_div(int n)
{
	int div=0;
	for (int i=1;i<=Math.sqrt(n);i++)
	{
		if (n%i==0)
			div=div+i+i/n;
	}
return div;
}
static int gcd (int n1,int n2)
{
int gcd=1;
for (int i=1;i<=n1 && i<=n2;i++)
{
	if (n1%i==0 && n2%i==0)
		gcd=i;
}
return gcd;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Numbers:");
        int a=sc.nextInt();
        int b=sum_div(a);
        System.out.println("sum of div="+b);
        int hcf=gcd(a,b);
        System.out.println("GCD="+hcf);
        if (hcf==1)
        System.out.println("Duffinian Number");
        else 
        	System.out.println("Noy Duffinian Number");
	}

}
