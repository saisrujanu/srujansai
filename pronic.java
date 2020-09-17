package log_on;
import java.util.*;
public class pronic {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Number:");
		int num=sc.nextInt();
		int x=0;
		for(int i=0;i<num;i++)
		{
			if (i*(i+1)==num)
			{
				x=1;
				break;
			}
		}
if (x==1)
	System.out.println("pronic number ");
else 
	System.out.println("not pronic number");
	}

}
