// Write a program to test the Prime number.

import java.io.*;
import java.util.Scanner;
class prime
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int flag=0;
for(int i=2;i<=n/2;i++)
{
if(n%i==0)
{
flag=1;
break;
}
}
if(flag==0)
System.out.println(n + " is a prime number");
else
System.out.println(n + " is not a prime number");
}
}

/* 
      Output:-
          java prime
          789353436 is not a prime number
          java prime
          79432487 is a prime number
          
