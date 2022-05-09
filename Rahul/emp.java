import java.util.Scanner;
class emp{
public static void main(String[] args) {
Scanner sn=new Scanner(System.in);
int n;
System.out.print("Enter the number of Employees:");
n=sn.nextInt();
Teacher tr[]=new Teacher[n];
for (int i=0;i<n;i++) {
tr[i]=new Teacher();
}
for (int i=0;i<n;i++) {
System.out.println("\nDetails of teacher "+(i+1)+":");
tr[i].display();
}
}
}

class Employee{
Scanner sn=new Scanner(System.in);
int empid;
String name;
float salary;
String address;

Employee(){
System.out.println("\nDetails of Teacher: ");
System.out.print("Enter employee id: ");
empid=sn.nextInt();
System.out.print("Enter the name of employee: ");
name=sn.next();
System.out.print("Enter the salary of employee: ");
salary=sn.nextFloat();
System.out.print("Enter the address of employee: ");
address=sn.next();
}
}
class Teacher extends Employee{
String dept;
String sub;
Teacher(){
super();
System.out.print("Enter the department:");
dept=sn.next();
System.out.print("Enter the subject:");
sub=sn.next();
}

void display(){
System.out.println("Employee id: "+empid);
System.out.println("Name of the employee: "+name);
System.out.println("Salary of the employee: "+salary);
System.out.println("Address of the employee: "+address);
System.out.println("Department: "+dept);
System.out.println("Subject: "+sub);
}
}
