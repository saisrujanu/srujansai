package pack2;
import java.util.*;
public class switchcase {
	public static void main(String[]args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the two numbers:");
		int x=obj.nextInt();
		int y=obj.nextInt();
		System.out.println("1.additiion");
		System.out.println("2.subtraction");
		System.out.println("3.multiplication");
		System.out.println("4.division");
		System.out.println("enter the (1...4);");
		int ch=obj.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("addition:"+1);
			break;
		case 2:
			System.out.println("subtraction:"+2);
			break;
		case 3:
			System.out.println("multiplication:"+3);
			break;
		case 4:
			System.out.println("division:"+4);
			break;
		default:
			System.out.println("Invalid choice");
			
		}
	
	}

}
