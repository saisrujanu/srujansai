package prgs6;
import java.util.*;
public class Format {
	public static void main(String[] args) {
	  Scanner sc=new Scanner (System.in);
      System.out.println("Enter Number:");
      int n=sc.nextInt();
      int i=1;
      while (n!=0)
      {
    	  if (i<n)
    	  {
    		  System.out.print(i+"");
    		  i++;
    	  }
    	  else 
    		  System.out.print(n+"");
    	  n--;
      }
	  
	}

}
