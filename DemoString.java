// Write a program to design a string class that performs string methods(Equal, Reverse the string, Change case).

import java.util.*;
import java.util.Scanner;
class DemoString
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the 1st string: ");
String s1=s.nextLine();
System.out.println("Enter the 2nd string: ");
String s2=s.nextLine();
String s3=" ";
char ch;
System.out.println("the string is: "+s1);
System.out.println("the string uppercase is: "+s1.toUpperCase());
System.out.println("the string lowercase is: "+s1.toLowerCase());
System.out.println("two strings comparision is: "+(s1.equals(s2)));
for (int i=0; i<s1.length(); i++)
{
ch= s1.charAt(i);
s3= ch+s3;
}
System.out.println("the string reverse is: "+s3);
}
}

/* 
    Output:- 
      Enter the 1st string :
      Albatross
      Enter the 2nd string :
      Nani
      the string is : Albatross
      the string uppercase is: ALBATROSS
      the string lowercase is: albatross
      two string comparision is: false
      the string reverse is: ssortablA
      
