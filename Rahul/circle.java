import java.util.Scanner;
class circlef
{
	double r,per,a;
	double pi=3.14;
	void perimeter()
	{
		per=2*pi*r;
	}
	void area()
	{
		a=pi*r*r;
	}
	void display()
	{
		System.out.println("Area of the circle: "+a);
		System.out.println("Perimeter of the circle: "+per);
	}
}
class circle
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		circlef ob1=new circlef();
		System.out.println("Enter the radius of the circle:");
		ob1.r=sc.nextInt();
		ob1.perimeter();
		ob1.area();
		ob1.display();
	}
}
