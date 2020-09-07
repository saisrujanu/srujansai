package prgs2;
import java.util.*;
public class fib_series {
	public static void main(String[] args){
		Scanner obj=new Scanner (System.in);
		System.out.println("Enter number:");
		int n=obj.nextInt();
		int t1=0,t2=1;
		System.out.println("Fibonacci number:");
		System.out.println(t1+""+t2);
		for (int i=2;i<n;i++)
		{
			int sum=t1+t2;
			System.out.println(""+sum);
			t1=t2;
			t2=sum;
		}

	}

}
