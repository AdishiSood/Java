/*

The java string intern() method returns the interned string. It returns the canonical representation of string.

It can be used to return string from memory, if it is created by new keyword. It creates exact copy of heap string object in string constant pool.

*/
public class Intern
{  
public static void main(String args[])
{  
String s1=new String("github");  
String s2="github";  
String s3=s1.intern();//returns string from pool, now it will be same as s2  
System.out.println(s1==s2);//false because reference is different  
System.out.println(s2==s3);//true because reference is same  
}
}  

