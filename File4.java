package Prgs9;
import java.io.*;
public class File4 {

	public static void main(String[] args) 
		throws Exception
		{
			File f =new File("d:\\abc.txt");
			FileReader fr=new FileReader(f); // TODO Auto-generated method stub
	        char [] ch =new char[20];
	        fr.read(ch);
	        for (char c1:ch)
	        {
	        	System.out.println("ch1");
	        }
	
		}
	}


