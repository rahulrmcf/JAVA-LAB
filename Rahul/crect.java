import java.util.Scanner;
public class crect{
	public static void main(String args[])
	{
		circle c=new circle();
		rect r=new rect();
		Scanner sc=new Scanner(System.in);
		int opt;
		do
		{
			System.out.println("\nEnter your choice\n1.Rectangle\n2.Circle\n3.Exit\n");
			opt=sc.nextInt();
			switch(opt)
			{
			case 1:r.read();
					r.area();
					r.perimeter();
					break;
			case 2:	c.read();
					c.area();
					c.perimeter();
					break;
			case 3:break;
			default: System.out.println("Invalid Input!!");

				}

		}while(opt!=3);
	}
}
interface ap
{
	public void area();
	public void perimeter();
}

class rect implements ap
{
	int l,b;
	Scanner sc=new Scanner(System.in);
	void read()
	{
	System.out.println("Enter length and breadth");
	 l=sc.nextInt();
	 b=sc.nextInt();
	}
public void area()
{
int ar=l*b;
System.out.println("Area of Rectangle is "+ar);
}
 public void  perimeter()
{
int pr=2*(l+b);
System.out.println("Perimeter rectangle is "+pr);
}
	
}
class circle implements ap
{
	Scanner sc=new Scanner(System.in);
	float ra;
	void read()
	{
	System.out.println("Enter the radius");
	ra=sc.nextFloat();
	}
	public void area()
	{
		float ar=(float)3.14*ra*ra;
		System.out.println("Area of circle is "+ar);
	}
	public void perimeter()
	{
	float pr=(float)3.14*2*ra;
	System.out.println("Perimeter circle is "+pr);
	}
}