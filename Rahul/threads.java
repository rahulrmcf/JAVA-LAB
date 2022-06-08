import java.util.Scanner;
class mult extends Thread
{
	int i;
	public void run()
	{
		System.out.println("Multiplication table of 5 is:");
		for(i=1;i<=10;i++)
		{
			System.out.println("5 x"+i+" = "+(i*5));
		}
	}
}
class prime extends Thread
{
	int n;
	Scanner sn=new Scanner(System.in);
	public void run()
	{
		System.out.println("Enter n:");
		n=sn.nextInt();
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<i/2;j++)
			{
				if(i%j==0)
				{
					System.out.println(i);
				}
			}	
		}
		

	}

}
class threads{
	public static void main(String[] args) {
		mult m=new mult();
		prime p=new prime();
		m.start();
		p.start();
	}
}