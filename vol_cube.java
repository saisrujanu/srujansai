package formula_prgs;
import java.util.*;
public class vol_cube {
	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter radius:");
	int r=sc.nextInt();
	System.out.println("enter height:");
	int h=sc.nextInt();
	double v=3.14*(r*r)*h/3;
	System.out.println("volume of cube="+v);
	}

}
