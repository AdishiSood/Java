/*
Imagine a publishing company that markets both Book and CD's of its works. A class Publication is created that stores the title (a string) and price (type int) of a publication. From this class derive two classes:

Book, which adds a page count and author, and a constructor having title, price, pages & writer as parameters.
CD, which adds a playing time in minutes, and a constructor having title, price & length as parameters.
Each of these two classes should have a putdata() function to display its data as shown in sample output.
 
*/

import java.util.Scanner;

class Publication
{
  	String title;
  	int price;
}

class Book extends Publication
{
String writer;
int pages;
Book(String title,int price,int pages,String writer)
{
this.title=title;
this.price=price;
this.pages=pages;
this.writer=writer;
}

/*SAMPLE OUTPUT: Book Title "Programming-In-C", written by "Schildt" has 1025 pages and of 150 rupees.*/
  void putdata()
 {
 System.out.printf("Book Title \"%s\", written by \"%s\" has %d pages and of %d rupees.",title,writer,pages,price);
 }
}

class CD extends Publication
{
int length;
CD(String title,int price,int length)
{
this.title=title;
this.price=price;
this.length=length;
}

 /*SAMPLE OUTPUT: CD Title "Rock-On", is of 185 minutes length and of 50 rupees.*/
 void putdata()
 {
 System.out.printf("\nCD Title \"%s\", is of %d minutes length and of %d rupees.",title,length,price);
 }
 }
class Main
{
  public static void main(String[] args)
  {
    String title, writer;
    int price, pages, time;
    Scanner s1=new Scanner(System.in);
    title=s1.nextLine();
    price=Integer.parseInt(s1.nextLine());
    pages=Integer.parseInt(s1.nextLine());
    writer=s1.nextLine();
    Book b = new Book(title, price, pages, writer);

    title=s1.nextLine();
    price=Integer.parseInt(s1.nextLine());
    time=Integer.parseInt(s1.nextLine());
    CD c = new CD(title, price, time);
    b.putdata();
    c.putdata();
  }
}

