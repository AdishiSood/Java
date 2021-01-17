/*

A class called BankAccount with two integer members as number, balance and many methods has been defined:

Method/Constructor                    Description   
public BankAccount(int number, int bal)     constructs a BankAccount object with number and opening balance provided. 
public void withdraw(int amt)         records the given withdrawl
public void deposit(int amt)          records the given deposit
public int getBalance()               returns current balance in INR

Design a new class MinMaxAccount whose instances can be used in place of a BankAccount object but include new behavior
of remembering the minimum and maximum balances ever recorded for the account.

You should provide the same methods as the superclass, as well as the following new behavior:

Method/Constructor                  Description   
public MinMaxAccount(int number, int bal)    constructs a MinMaxAccount object using information in the Startup object s   
public int getMin()                 returns minimum balance in INR
public int getMax()                 returns maximum balance in INR
Assume that only the debit and credit methods change an account's balance.

*/

import java.util.Scanner;
// Other imports go here
class BankAccount 
{
  int number, balance;
  public BankAccount(int number, int bal) 
  {
    this.number = number;
    this.balance = bal;
  }
  public void withdraw(int amt)      
  {
    this.balance -= amt;
  }
  public void deposit(int amt)     
  {
    this.balance += amt;
  }
  public int getBalance()
  {
    return this.balance;
  }
}
class MinMaxAccount extends BankAccount 
{
  int min,max,bal;
  public MinMaxAccount(int number,int bal)
  {
  super(number,bal);
  min=balance;
  max=balance;
  }
public void withdraw(int amt)
{
   super.withdraw(amt)
   balance=getBalance();
   if(balance>max)
   max=balance;
   else if(balance<min)
   min=balance;
}
public void deposit(int amt)
{
   super.deposit(amt);
   balance=getBalance();
   if(balance>max)
   max=balance;
   else if(balance<min)
   min=balance;
}
public int getMax()
  {
  return max;
  }
public int getMin()
  {
  return min;
  }
class Main
{
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      MinMaxAccount a=new MinMaxAccount(s.nextInt(), s.nextInt());
      System.out.println(a.getBalance());
      a.deposit(s.nextInt());
      System.out.println(a.getBalance());
      a.deposit(s.nextInt());
      System.out.println(a.getBalance());
      a.withdraw(s.nextInt());
      System.out.println(a.getBalance());
      a.deposit(s.nextInt());
      System.out.println(a.getBalance());
      a.withdraw(s.nextInt());
      System.out.println(a.getBalance());
      System.out.println(a.getMin());
      System.out.println(a.getMax());
    }
}
