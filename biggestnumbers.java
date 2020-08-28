package pack2;
import java.util.*;
public class biggestnumbers {
public static void main(String[] args) {
		Scanner obj =new Scanner(System.in);
		System.out.println("Enter the four values:");
		int a=obj.nextInt();
		int b=obj.nextInt();
		int c=obj.nextInt();
		int d=obj.nextInt();
		if(a>b&&a>c&&a>d)
		System.out.println("the biggest number is:"+a);
		else if(b>c&&b>d)
		System.out.println("the biggest number is:"+b);
		else if (c>d)
		System.out.println("the biggest number is:"+c);
		else
		System.out.println("the biggest number is :"+d);
			
		}
	}
