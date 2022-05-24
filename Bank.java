// Write a program to design a class to find account using the inheritance and static that show all function of bank(withdrawal,deposite).

import java.util.*;
import java.util.Scanner;
class Bank {
 static int acc_no = 10001;
 float amt;
 public void display() {
  System.out.println("Account no :" + acc_no);
  System.out.println("Current Amount :" + amt);
 }
 public Bank() {
  amt = 1000;
 System.out.println("Ur account no is " + acc_no);
acc_no++;
 }
 public void getamt() {
  System.out.println("Current balance :" + amt);
 }
 public void withdraw(float x) {
  if (amt == 1000 || amt <= x) {
   System.out.println("Sorry u can't withdraw");
  } else {
   amt = amt - x;
   System.out.println("amount withdraw :" + x);
   System.out.println("After withdrawl");
   getamt();
  }
 }
 public void deposit(float x) {
  if (x == 0.0)
   System.out.println("OOPS 0 can't be deposited");
  else {
   amt =amt+x;
   System.out.println("After deposition");
   getamt();
  }
 }
 public static void main(String args[]) {
  Scanner sc = new Scanner(System.in);
  Bank b1 = new Bank();
  b1.deposit(0);
  b1.withdraw(120.5f);
  b1.display();
  System.out.println("\n");
  Bank b2 = new Bank();
  b2.deposit(1000.0f);
  b2.withdraw(150.5f);
Bank b3 = new Bank();
  b3.deposit(1000.0f);
  b3.withdraw(150.5f);
 }
}

/* 
   Output:-
      Ur account no is 10001
      OOPS 0 can't be deposited
      sorry u can't withdraw
      Account no :10002
      Current Amount:1000.0
      
      Ur account no is 10002
      After deposition
      Current balance :2000.0
      amount withdrawl
      Current balance :1849.5
      Ur account no is 10003
      After deposition
      Current balance :2000.0
      amount withdraw :150.0
      After withdrawl
      Current balance :1849.5
