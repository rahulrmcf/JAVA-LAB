import java.util.Scanner;
public class Summ
{
public static void main(String args[])
{
int a,b,sum;
System.out.println("Enter 2 numbers: ");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
sum=a+b;
System.out.println("Sum:"+sum);
}
}