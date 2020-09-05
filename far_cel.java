package formula_prgs2;
import java.util.*;
public class far_cel {
	public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    float f,c;
    System.out.println("Enter the farenheit temperature:");
	f=sc.nextFloat();
	c=((f-32)*5/9);
	System.out.println("celsius temperature is="+c);
	}

}
