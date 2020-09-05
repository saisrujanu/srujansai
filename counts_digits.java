package formula_prgs2;
import java.util.*;
public class counts_digits {
	public static void main(String[] args) {
		Scanner obj=new Scanner (System.in);
		System.out.println("Enter number:");
		int num=obj.nextInt();
		int c=0;
		while (num!=0)
		{
			num=num/10;
			c++;
		}
System.out.println("number of digits:"+c);
	}

}
