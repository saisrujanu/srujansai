package prg1;
import java.util.*;
public class Strong {
	public static void main(String[] args) {
	Scanner obj=new Scanner (System.in);
	System.out.println("Enter Number:");
	int n=obj.nextInt();
	int sum=0;
	while(n!=0)
	{
		int rem=n%10;
		int fact=1;
		for (int i=1;i<=rem;i++)
		{
			fact =fact*i;
		}
	sum=sum+fact;
	n=n/10;
	}
if (sum==temp)
	System.out.println(temp+"is a strong number");
else 
	System.out.println(temp+"is not a  strong number");
	}

}
