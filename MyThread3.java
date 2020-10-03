package Prgs8;
class MyThreadp extends Thread
{
	public void run()
	{
	for (int i=1;i<=10;i++)
	{
		System.out.println("Sub class");
	}
	}
	
}
public class MyThread3 {

	public static void main(String[] args) {
		MyThreadp obj=new MyThreadp();
		obj.setPriority(10);
		obj.start();
		for (int j=1;j<=10;j++)
		{
			System.out.println("Main Class");
		}
 	}

}
