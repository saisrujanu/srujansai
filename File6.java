package Pack1;
import java.util.*;
public class File6 {
	public static void main(String[]args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the value of radius:");
		float r=obj.nextFloat();
		float a=(3.14f*r*r);
		System.out.printf("%1.2f",a);
		System.out.println("area of the circle:"+a);
	}

}
