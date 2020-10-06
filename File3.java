package Prgs9;
import java.io.*;
public class File3 {

	public static void main(String[] args)
	throws Exception
	{
		FileWriter fw=new FileWriter("d:\\abc.txt",true);// TODO Auto-generated method stub
        fw.write("Aditya");
        fw.write("Colleges");
        fw.flush();
        fw.close();
        System.out.println("Done");
	}

}
