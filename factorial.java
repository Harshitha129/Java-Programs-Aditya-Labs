//Write a program in Java to find the factorial of a given number using recursion

import java.util.Scanner;
class factorial
{
public static void main(String args[])
{
long n,mul;
Scanner s=new Scanner(System.in);
System.out.println("enter a value");
n=s.nextLong();
factorial f=new factorial();
mul=f.fact(n);
System.out.println("factorial of " +n+ " : " +mul);
}
long fact(long x)
{
if(x>1)
{
return(x*fact(x-1));
}
return 1;
}
}

/* 
    Output:- 
        Enter a value :
        10
        factorial of 10 : 3628800
