import java.util.Scanner;
public class reverseofn
{
public static void main(String args[])
{
int d,n,r=0;
System.out.println("Enter the number: ");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
while(n!=0)
{
d=n%10;
r=r*10+d;
n=n/10;
}
System.out.println("Reverse of the number: "+r);
}
}