//Write a programm that implement the Nested try statements.

class NestedExcep
{
public static void main(String args[])
{
try
{
int arr[]={1,0,4,2};
try
{
int x=arr[2]/arr[3];
}
catch(ArithmeticException ae)
{
System.out.println("Divide by zero");
}
arr[4]=3;
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Array index out of  bound exception");
}
}
}

/* Output:- 
      Array index out of bound Exception.
