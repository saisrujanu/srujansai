package prgs6;
public class pattern5 {
	public static void main(String[] args) {
		int size=5;
		for (int i=size;i>=size;i--)
		{
			for (int j=1;j<=Math.abs(i);j++)
				System.out.print("");
			for (int k=size;k>=Math.abs(i);k--)
				System.out.println();
		}

	}

}
