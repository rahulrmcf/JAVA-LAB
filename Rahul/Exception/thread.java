import java.util.Scanner;
class mult extends Thread
{
	int i;
	public void run()
{
	System.out.println("Multiplication table of 5: ");
	for(i=1;i<=10;i++)
{
	System.out.println("\n5 x "+i+" = "+(i*5));
}
}
}
	class prime extends Thread
{
	int n,f=0,i=2;
	Scanner sn=new Scanner(System.in);
public void run()
{
	System.out.println("The prime numbers: ");
	while(i<=10)
{
	for(int j=2;j<i/2;j++)
{
	if(i%j==0)
{
	f=1;
	break;
	}
		}
			if(f!=1)
			{
				System.out.print(" "+i);
			}
			i++;
			f=0;
		}
	}

}
class thread{
	public static void main(String[] args) {
		mult m=new mult();
		prime p=new prime();
		m.start();
		p.start();
	}
}