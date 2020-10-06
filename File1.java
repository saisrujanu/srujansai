package Prgs9;
import java.io.*;
public class File1 {
	public static void main(String[] args)
	throws Exception
	{
		int c=0;// TODO Auto-generated method stub
		File f=new File ("e:\\");
		String [] s=f.list();
		for (String s1: s)
		{
			System.out.println(s1);
			c++;
		}
System.out.println("total="+c);
	}

}
