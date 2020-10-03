package Prgs8;
class MyThread1 extends Thread
{
	public void run()
	{
	for (int i=1;i<=10;i++)
	{
		System.out.println("Sub class");
	}
	}
	
}
public class join {

	public static void main(String[] args) 
		throws Exception   {
		MyThread1 obj=new MyThread1();
		obj.setPriority(10);
		obj.start();
		obj.join();
		for (int j=1;j<=10;j++)
		{
			System.out.println("Main Class");
		}
 	

	}

}
