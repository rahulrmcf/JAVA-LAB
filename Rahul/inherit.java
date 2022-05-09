import java.util.Scanner;
public class inherit 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the limit: ");
		n=sc.nextInt();
		teacher tr[]=new teacher[n];
		for(int i=0;i<n;i++)
		{
			tr[i]=new teacher();
		
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("\nDetails: "+(i+1)+":");
			tr[i].display();
		}
			
			}
}
class person
{
	int age;
	String name,address,gender;
	person()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\nDetails :");
		System.out.println("Enter the name: ");
		name=sc.next();
		System.out.println("Enter the age: ");
		age=sc.nextInt();
		System.out.println("Enter the address: ");
		address=sc.next();
		System.out.println("Enter the gender: ");
		gender=sc.next();
	}
}
class employee extends person
{
	int empid, salary;
	String company,qualif;
	employee()
	{
		super();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee id: ");
		empid=sc.nextInt();
		System.out.println("Enter the salary: ");
		salary=sc.nextInt();
		System.out.println("Enter the company name: ");
		company=sc.next();
		System.out.println("Enter qualification: ");
		qualif=sc.next();
	}
}
class teacher extends employee
{
	String subj,dept;
	int tid;
	teacher()
	{
		super();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the teacher id: ");
		tid=sc.nextInt();
		System.out.println("Enter the department : ");
		dept=sc.next();
		System.out.println("Enter the subject: ");
		subj=sc.next();
	}
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("Gender: "+gender);
		System.out.println("Age: "+age);
		System.out.println("Employee id: "+empid);
		System.out.println("Salary: "+salary);
		System.out.println("Company name: "+company);
		System.out.println("Qualification: "+qualif);
		System.out.println("Subject: "+subj);
		System.out.println("Teacher: "+tid);
		System.out.println("Department: "+dept);

	}
}