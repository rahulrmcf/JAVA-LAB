import java.util.Scanner;
class invalid extends Exception
{
	public invalid(String str){
		super(str);
	}
}

class checkexception
{
	Scanner sc=new Scanner(System.in);
	String user="Rahul",pass="rahulpr";
	String username,password;
	void get() throws invalid
	{
		System.out.println("Enter the username: ");
		username=sc.next();
		System.out.println("Enter the password: ");
		password=sc.next();
		if(username.equals(user) && pass.equals(pass))
		{
			System.out.println("LOGIN SUCCESSFULL");
		}
		else
		{
			throw new invalid("INVALID USERNAME OR PASSWORD");
		}

	}
}

class exception
{
	public static void main(String args[])
	{
		checkexception c=new checkexception();
		try
		{
			c.get();
		}
		catch(invalid u)
		{
			System.out.println("EXCEPTION OCCURED\n"+u);
		}
	}
}