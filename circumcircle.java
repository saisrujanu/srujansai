package Pack1;
import java.util.*;
public class circumcircle { 
	public static void main(String[]args)
	{
	Scanner obj=new Scanner(System.in);
	System.out.println("enter the value of the radius:");
	float r=obj.nextFloat();
	float a=(2*3.14f*r); 
	System.out.printf("%1.2f",a);
	System.out.println("area of the circumference:"+a);
	}
}
