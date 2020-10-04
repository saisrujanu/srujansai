package Prgs8;
class MyThread extends Thread
{
	public void run()
	{
	for (int i=1;i<=10;i++)
	{
		Thread.yield();
		System.out.println("Sub class");
	}
	}
	
}
public class yield{

	public static void main(String[] args) {
		MyThread obj=new MyThread();
		obj.setPriority(10);
		obj.start();
		for (int j=1;j<=10;j++)
		{
			System.out.println("Main Class");
		}
 	}

}
