import java.util.Scanner;
class GCD
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int gcd=1,i;
for(i=1;i<=a&&i<=b;i++)
{
if(a%i==0 && b%i==0)
gcd = i;
}
System.out.println("GCD of " +a+ " and " +b+ " is: " +gcd);
}
}

/*  
    Output:- 
        7
        9
        GCD of 7 and 9 is : 1
