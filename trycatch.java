import java.util.Scanner;
class trycatch
{
public static void main(String args[])
{
int x,y;
int a[] = {10,20,30};
Scanner sc=new Scanner(System.in);
System.out.println("enter x value: ");
x=sc.nextInt();
System.out.println("enter y value: ");
y=sc.nextInt();
try
{
int res;
res=x/y;
System.out.println("The result is: " +res);
System.out.println(a[10]);
}
catch(ArithmeticException ae)
{
System.out.println("Arithmatic Exception caught");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("ArrayIndexOutOfBoundsException occurs");
}
}
}