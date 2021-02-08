/*

This is the Java Program to Find the Elements that do Not have Duplicates.

Problem Description
Given an array, print all the elements whose frequency is one, that is they do not have duplicates.

Example:
Array = [-1, -2, 3, 3, -2]

Output = -1

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class NoDuplicates {
    // Function to print elements with no duplicates
    static void printElementsWithNoDuplicates(int[] array){
        int i,j;
        int count;
        int x = 0;
        boolean[] flag = new boolean[array.length];
        for(i=0; i<array.length; i++){
            if(!flag[i]){
                count  = 1;
                for(j=i+1; j<array.length;j++){
                    if(array[j] == array[i])
                    {
                        count++;
                        flag[j] = true;
                    }
                }
                if(count == 1){
                    System.out.println(array[i]);
                    x++;
                }
            }
        }
        if(x==0){
            System.out.println("All elements are repeated");
        }
    }
    // Function to read input
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size;
        System.out.println("Enter the size of the array");
        try {
            size = Integer.parseInt(br.readLine());
        } catch (Exception e) {
            System.out.println("Invalid Input");
            return;
        }
        int[] array = new int[size];
        System.out.println("Enter array elements");
        int i;
        for (i = 0; i < array.length; i++) {
            try {
                array[i] = Integer.parseInt(br.readLine());
            } catch (Exception e) {
                System.out.println("An error Occurred");
            }
        }
        System.out.println("The elements are ");
        printElementsWithNoDuplicates(array);
    }
}
