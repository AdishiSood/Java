import java.util.*;
public class RemoveDuplicates{  
    public static int removeDuplicateElements(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }    
        int j = 0;//for next element  
        for (int i=0; i < n-1; i++){  
            if (arr[i] != arr[i+1]){  
                arr[j++] = arr[i];  
            }  
        }  
        arr[j++] = arr[n-1];  
        return j;  
    }  
       
    public static void main (String[] args) {  
       Scanner sc=new Scanner (System.in);
       int arr[]=new int[10];
       for(int i=0;i<10;i++)
       {
           arr[i]=sc.nextInt();
       }
        int length = arr.length;  
        length = removeDuplicateElements(arr, length); 
        
        //printing array elements  
        for (int i=0; i<length; i++)  
           System.out.print(arr[i]+" ");  
    }  
}  
