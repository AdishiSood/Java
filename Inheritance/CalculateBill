/*
1)Generate bill on the basis of Item price and quantity i.e. Bill = price of item * quantity
2)Calculates cash from notes of Rs 2000, Rs 500, Rs 100, Rs 50, and Rs 10.
3)Match cash against bill and display “Clear” message if no balance was there otherwise print the amount needs to pay.
*/
// So this code develops two classes Bill and Cash, where Cash inherits Bill.

import java.util.Scanner;
class CalculateBill
{
  public static void main(String args[])
  {
   Cash d=new Cash();
   d.get_cash();
   d.display();
   }
 }
 
 // Formula Used: Bill = price of item * quantity
 
 class Bill
 {
 Scanner sc=new Scanner(System.in);
  // p = price,q = quantity
 int p=sc.nextInt();
 int q=sc.nextInt();
 }
 class Cash extends Bill
 {
  int cash,bill;
  int r2000=sc.nextInt();
  int r500=sc.nextInt();
  int r100=sc.nextInt();
  int r50=sc.nextInt();
  int r10=sc.nextInt();
   void get_cash()
   { 
   bill= p*q;
   cash =  r2000*2000 + r500*500 + r100*100 + r50*50 + r10*10;
   }
   void display()
  {
  if(bill>cash)
   {
   System.out.println("Need to pay: "+(bill-cash));
   }
  else
   {
   System.out.println("Clear");
   }
 
