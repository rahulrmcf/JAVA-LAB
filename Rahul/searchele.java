import java.util.Scanner;
public class searchele
{
public static void main(String args[])
{
int n,x,a;
System.out.println("Enter the limit: ");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int[] array=new int[10];
System.out.println("Enter the array elements: ");
for(int i=0;i<n;i++)
{
array[i]=sc.nextInt();
}
System.out.println("Enter the element to search:");
x=sc.nextInt();
for(int i=0;i<n;i++)
{
	if(array[i]==x)
	{
		System.out.println("Element found at position: "+(i+1));
		break;
	}
if(array[i]==n)
	{
		System.out.println("Element not found");
	}
}
}
}