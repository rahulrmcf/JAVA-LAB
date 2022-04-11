import java.util.Scanner;
class sum
{
	int a,b,c;
	void calculate()
	{
		c=a+b;
	}
	void display()
{
	System.out.println(c);
}
}
class add
{
	public static void main(String[] args) 
	{
	sum obj1=new sum();
	obj1.a=10;
	obj1.b=10;

	obj1.calculate();
	System.out.println("Object s1: ");
	obj1.display();
}
}