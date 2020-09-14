package prgs3;
import java.util.*;
public class Sum_Even_Odd {
	public static void main(String[] args) {
		Scanner obj=new Scanner (System.in);
		System.out.println("Enter number :");
		int n=obj.nextInt();
		int even_sum=0,odd_sum=0;
		while (n!=0)
		{
			int rem=n%10;
			if (rem%2==0)
				even_sum=even_sum+rem;
			else 
				odd_sum=odd_sum+rem;
			n=n/10;
		}
System.out.println("Even sum="+even_sum);
System.out.println("Odd sum="+odd_sum);
	}

}
