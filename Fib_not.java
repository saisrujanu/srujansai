package prgs2;
import java.util.*;
public class Fib_not {
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		int a=0,b=1,c=0;
		while (c<n)
		{
			c=a+b;
			a=b;
			b=c;
		}
if(c==n)
	System.out.println(n+"Fibonnaci Number");
else 
	System.out.println(n+"is not a Fibonacci series");
	}

}
