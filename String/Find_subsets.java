/*
In this program, all the subsets of the string need to be printed.
The subset of a string is the character or the group of characters that are present inside the string.

All the possible subsets for a string will be n(n+1)/2.

For example, all possible subsets of a string "FUN" will be F, U, N, FU, UN, FUN.
To complete this program, we need to run two for loops. The outer loop is used to maintain the relative position
of the first character and the second loop is used to create all possible subsets and prints them one by one

*/
public class FindSubsets {  
    public static void main(String[] args) {  
  
        String str = "FUN";  
        int len = str.length();  
        int temp = 0;  
        //Total possible subsets for string of size n is n*(n+1)/2  
        String arr[] = new String[len*(len+1)/2];  
  
        //This loop maintains the starting character  
        for(int i = 0; i < len; i++) {  
            //This loop adds the next character every iteration for the subset to form and add it to the array  
            for(int j = i; j < len; j++) {  
                arr[temp] = str.substring(i, j+1);  
                temp++;  
            }  
        }  
  
        //This loop prints all the subsets formed from the string.  
        System.out.println("All subsets for given string are: ");  
        for(int i = 0; i < arr.length; i++) {  
            System.out.println(arr[i]);  
        }  
    }  
}  

/*
OUTPUT:

All subsets for given string are:
F
FU
FUN
U
UN
N
*/
