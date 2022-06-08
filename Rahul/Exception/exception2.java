import java.util.Scanner;
class negative extends Exception
{
	public negative(String str)
	{
		super(str);
	}
}
class avg
{
	Scanner sn=new Scanner(System.in);
	int avg=0,n,lim;
	void read() throws negative
	{
		System.out.println("Enter the limit: ");
		lim=sn.nextInt();
		System.out.println("Enter the numbers: ");
		for (int i=0;i<lim;i++) 
		{
			n=sn.nextInt();
			if(n<0)
			{
				throw new negative("\nNegative number entered.");
			}
			else
			{
				avg=avg+n;
			}
			
		}
		System.out.println("Average: "+(avg/lim));
	}
 
}
class exception2{
	public static void main(String[] args) {
		try
		{
			avg c1=new avg();
			c1.read();

		}
		catch(negative n1)
		{
			System.out.println("\nException!!"+n1);
		}
	}
}