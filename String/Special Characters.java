import java.util.regex.*;
import java.io.BufferedReader;
import java.util.*;
import java.io.IOException;
import java.io.InputStreamReader;

class Special_Characters
{
    public static void onlySpecialCharacters(String str)// Function to check if a string contains only special characters
    {
        String regex = "[^a-zA-Z0-9]+";// Regex to check if a string contains only special characters
         //[^a-zA-Z0-9] represents only special characters, + represents one or more times.
        Pattern p = Pattern.compile(regex);
 
        // If the string is empty then print No
        if (str == null) {
            System.out.println("No");
            return;
        }
        Matcher m = p.matcher(str);// Find match between given string & regular expression
        if (m.matches())
            System.out.println("Yes");
        else
            System.out.println("No");
    }
 
    // Driver Code
    public static void main(String args[])throws IOException
    {
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        String str=b.readLine();
        onlySpecialCharacters(str); // Function Call
    }
}
