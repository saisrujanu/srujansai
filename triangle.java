package Pack1;
import java.util.*;
public class triangle {
	public static void main(String[]args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the base value:");
		float b=obj.nextFloat();
		System.out.println("enter the value of height:");
		float h=obj.nextFloat();
		float a=(b*h)/2;
		System.out.println("the area of the triangle is:"+a);
	}
}
