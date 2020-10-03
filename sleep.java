package Prgs8;
class MyThread2 extends Thread
{
	public void run()
	{
	for (int i=1;i<=10;i++)
	{
		System.out.println("Sub class");
		
	}
	}
	
}
public class sleep {

	public static void main(String[] args)
	throws Exception
	{
		MyThread2 obj=new MyThread2();
		obj.setPriority(10);
		obj.start();
		for (int j=1;j<=10;j++)
		{
			System.out.println("Main Class");
			Thread.sleep(3000);
		}
 	}

}


