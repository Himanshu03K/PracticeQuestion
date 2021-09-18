/*
Q2. Write a program to initialize an integer array with values and check if a given number is present in the array or not.

If the number is not found, it will print -1 else it will print the index value of the given  number in the array.

Example 1) If the Array elements are  {1,4,34,56,7} and the search element is 90, then the output expected is -1.

Example 2)If the Array elements are  {1,4,34,56,7} and the search element is 56, then the output expected is 3.
 */


import java.sql.SQLOutput;
import java.util.*;
public class Q2 {
    public int arr[];
    Q2(int n){
        arr= new int[n];
    }
    public void array_Input(){
        Scanner sc= new Scanner(System.in);
        for(int i =0;i<arr.length;i++)
            arr[i]=sc.nextInt();
    }

    public void Result(int x) {
        var c=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]== x){
                System.out.println(i);
                c=1;
                break;
            }
        }
        if(c==0)
            System.out.println("-1");
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int a=sc.nextInt();
        Q2 obj =new Q2(a);
        System.out.println("Enter the array");
        obj.array_Input();
        System.out.println("Enter the number to be search");
        int s= sc.nextInt();
        obj.Result(s);
    }
}
