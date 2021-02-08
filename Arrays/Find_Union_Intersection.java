/*
For example:
Given two arrays of integers, find and print the union and intersection of the arrays.

Example:
Array: [1,2,3,4,5]

Array1: [5,3,6,7,9]

Output:
Union = [1,2,3,4,5,6,7,9]

Intersection = [3,5]

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
 
public class UnionAndIntersection {
    // Function to find and display the union and intersection
    static void displayUnionAndIntersection(int[] arrayOne,int[] arrayTwo){
        Set<Integer> obj = new HashSet<>();
        int i,j;
        for(i=0; i<arrayOne.length; i++){
            obj.add(arrayOne[i]);
        }
        for(j=0; j<arrayTwo.length; j++){
            obj.add(arrayTwo[j]);
        }
        System.out.println("The union of both the arrays is");
        for(Integer I: obj){
            System.out.print(I + " ");
        }
        System.out.println();
        obj.clear();
        System.out.println("The intersection of both the arrays is");
        for(i=0; i<arrayOne.length; i++){
            obj.add(arrayOne[i]);
        }
        for(j=0; j<arrayTwo.length; j++){
            if(obj.contains(arrayTwo[j]))
                System.out.print(arrayTwo[j] + " ");
        }
    }
    // Function to read the input
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int m,n;
        System.out.println("Enter the size of the two arrays");
        try {
            n = Integer.parseInt(br.readLine());
            m = Integer.parseInt(br.readLine());
        }
        catch (IOException e)
        {
            System.out.println("Invalid input");
            return;
        }
        int[] arrayOne = new int[n];
        int[] arrayTwo = new int[m];
        System.out.println("Enter the first array elements");
        int i,j;
        for(i=0; i<arrayOne.length; i++){
            try {
                arrayOne[i] = Integer.parseInt(br.readLine());
            }
            catch (IOException e)
            {
                System.out.println("Invalid array element. Enter it again");
                i--;
            }
        }
        System.out.println("Enter the second array elements");
        for(i=0; i<arrayTwo.length; i++){
            try {
                arrayTwo[i] = Integer.parseInt(br.readLine());
            }
            catch (IOException e)
            {
                System.out.println("Invalid array element. Enter it again");
                i--;
            }
        }
        displayUnionAndIntersection(arrayOne,arrayTwo);
    }
}
