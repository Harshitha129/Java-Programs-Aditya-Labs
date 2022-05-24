// Write a program to handle the user defined exception using throw keyword.

import java.util.*;
class Throw
{
static void checkAge(int age)
{
if(age<18)
{
throw new ArithmeticException("Access denied - You must be at least 18 years");
}
else
{
System.out.println("Access granted - You are old enough!");
}
}
public static void main(String args[])
{
checkAge(20);
}
}

/* 
     Output:- 
        Access granted - You are old enough!
