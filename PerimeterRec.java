// Write a program to create simple class to find out the Area and Perimeter of rectangle and box using super and this keyword.

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

/*  
    Output:- 
        7
        8
        Area of rectangle :  56
        perimeter of rectangle : 30
