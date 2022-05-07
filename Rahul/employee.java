import java.util.Scanner;
class employee
{
	public static void main(String[] args) 
	{
	Scanner sn=new Scanner(System.in);
	int n;
	System.out.print("Enter Number of Employees:");
	n=sn.nextInt();
	Teacher tr[]=new Teacher[n];
	for (int i=0;i<n;i++) 
	{
		tr[i]=new Teacher();
	}
	for (int i=0;i<n;i++) {
		System.out.println("\nDetails of Teacher "+(i+1)+":");
		tr[i].display();
	}
	
}
}

class Emp
{
	Scanner sn=new Scanner(System.in);
	int empid;
	String name;
	float salary;
	String address;

	Emp()
	{
		System.out.println("\nEnter Details of Teacher:");
		System.out.print("Enter Employee Id:");
		empid=sn.nextInt();
		System.out.print("Enter Name:");
		name=sn.next();
		System.out.print("Enter Salary:");
		salary=sn.nextFloat();
		System.out.print("Enter Address:");
		address=sn.next();
	}
}
class Teacher extends Emp
{
	String dept;
	String sub;
	Teacher()
	{
		super();
		System.out.print("Enter Department:");
		dept=sn.next();
		System.out.print("Enter Subject:");
		sub=sn.next();
	}

	void display()
	{
		System.out.println("Empid:"+empid);
		System.out.println("Name:"+name);
		System.out.println("Salary:"+salary);
		System.out.println("Address:"+address);
		System.out.println("Department:"+dept);
		System.out.println("Subject:"+sub);
	}
}