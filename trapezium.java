package formula_prgs2;
import java.util.*;
public class trapezium {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter 2 sides:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Enter height:");
		int h=sc.nextInt();
		int area=(a+b)*h/2;
		System.out.println("area of the trapezium="+area);

	}

}
