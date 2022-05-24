//write a java program to calculate the Simple Interest and input given by the user

import java.util.Scanner;
class si
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		float p=s.nextFloat();
		float r=s.nextFloat();
		float t=s.nextFloat();
		System.out.println("Simple Intrest is:" +(p*t*r)/100);
	}
}

/* 
	Output:- 
		7
		3
		9
		Simple intrest is : 1.89
