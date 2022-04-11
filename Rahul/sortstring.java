import java.util.Scanner;
public class sortstring
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the limit: ");
int n=sc.nextInt();
String temp;
String name[]=new String[n];
Scanner s1=new Scanner(System.in);
System.out.println("Enter the names: ");
for(int i=0;i<n;i++)
{
name[i]=s1.next();
}
for(int i=0;i<n;i++){
for(int j=1+i;j<n;j++)
{
if(name[i].compareTo(name[j])>0)
{
temp=name[i];
name[i]=name[j];
name[j]=temp;
}
}
}
System.out.println("Names in sorted order :");
for(int i=0;i<n;i++)
{
System.out.println(name[i]);

}
}
}