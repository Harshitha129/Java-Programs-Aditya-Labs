//Write a program in java to design a class using abstraction methods and classes

abstract class animal
{
abstract void sound();
}
class lion extends animal
{
void sound()
{
System.out.println("ROARING");
}
}
class add
{
public static void main(String args[])
{
lion ln=new lion();
ln.sound();
}
}

/*  
    Output:-
        ROARING.
