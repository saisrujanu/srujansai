package log_on;
import java.util.*;
public class snames {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
        System.out.println("Enter Number:");
        int n=sc.nextInt();
        int x=0;
        while(n!=0)
        {
        	if (n%2==0)
        		n=n/2;
        	else if (n%3==0)
        		n=n/3;
        	else if (n%5==0)
        		n=n/5;
        	else
        	{
        		x=1;
        		break;
        	}
        }
	if (x==0)
		System.out.println("Ugly Number");
	else
		System.out.println("Not Ugly Number");
	}

}
