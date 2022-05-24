// Write a program to Demonstrate type-casting in java.

class Tcast
{
public static void main(String args[])
{
int x;
float y;
double d;
d=134.67886d;
x=(int)d;
System.out.println(x);
y=33.322f;
x=(int)y;
System.out.println(x);
x=300;
y=x;
d=x;
System.out.println(y);
System.out.println(d);
}
}

/*
  Output:- 
        134
        33
        300.0
        300.0
