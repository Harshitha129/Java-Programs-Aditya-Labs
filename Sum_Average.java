//Write a program to find the average and sum of the numbers using commands line arguments

import java.util.Scanner;
public class Sum_Average
{
    public static void main(String[] args) 
    {
        int n, sum = 0;
        float average;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n ; i++)
        {
            a[i] = s.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Sum:"+sum);
        average = (float)sum / n;
        System.out.println("Average:"+average);
    }
}

/* 
    Output:- 
        Enter no. of elements in array : 10
        Enter all the elements :
        3
        7
        8
        2
        4
        8
        3
        9
        2
        4
        Sum : 50
        Average : 5.0
        
        
