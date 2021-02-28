/*

The java string getBytes() method returns the byte array of the string. In other words, it returns sequence of bytes.

There are 3 variant of getBytes() method. The signature or syntax of string getBytes() method is given below:
public byte[] getBytes()  
public byte[] getBytes(Charset charset)  
public byte[] getBytes(String charsetName)throws UnsupportedEncodingException  

*/
public class getBytes
{  
public static void main(String args[])
{  
String s1="gist";  
char ch[]={'g','i','t','h','u','b'};  
String s2=new String(ch);  
String s3=new String("programming");  
System.out.println(s1);  //gist
System.out.println(s2);  //github
System.out.println(s3);  //programming
}
}  
