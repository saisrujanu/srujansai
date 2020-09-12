package prgs2;
import java.util.*;
public class nth_fib {
	public static void main(String[] args) {
		Scanner obj =new Scanner (System.in);
		System.out.println("Enter number:");
		int n=obj.nextInt();
		int a=0,b=1,c=2;
		for(int i=2;i<n;i++)
		{
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println("Fibonacci number="+c);

	}

}
