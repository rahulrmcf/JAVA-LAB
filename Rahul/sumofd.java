import java.util.Scanner;
public class sumofd
{
public static void main(String args[])
{
int x,n,s=0,a;
System.out.println("Enter the number: ");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
while(a>0)
{
x=a%10;
s=s+x;
a=a/10;
}
System.out.println("Sum of a digit-: "+s);
}
}
