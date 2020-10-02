package prgs7;
class Thread1 extends Thread
{
public void run()
{
	for (int i=1;i<=10;i++)
	{
		System.out.println("Sub Class");
	}
}
}
public class MyThread {

	public static void main(String[] args) {
		Thread1 obj=new Thread1();
		obj.start();
		for (int i=1;i<=10;i++)
		{
			System.out.println("Main Class");
		}

	}

}
