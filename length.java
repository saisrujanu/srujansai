package Prgs9;
import java.io.*;
public class length {

	public static void main(String[] args) 
	throws Exception
		{
			File f =new File("d:\\abc.txt");
			FileReader fr=new FileReader(f); // TODO Auto-generated method stub
	        char [] ch =new char[(int)f.length()];
	        fr.read(ch);
	        for (char c1:ch)
	        {
	        	System.out.println("ch1");
	        }
		}
}
