import java.util.Scanner;
class PerimeterRec
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int l=s.nextInt();
int b=s.nextInt();
System.out.println("Area of rectagle:" + l*b);
System.out.println("Perimeter of rectangle:" + 2*(l+b));
}
}