/*
Q5. Given an array of type int, print true if every element is 1 or 4.

only14([1, 4, 1, 4]) → true
only14([1, 4, 2, 4]) → false
only14([1, 1]) → true
 */



import java.util.Scanner;

public class Q5 {
    public int arr[];

    Q5(int n) {
        arr = new int[n];
    }

    public void arrayInput() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public void result(){
        var c=0;

        for(int i=0;i<arr.length;i++) {
            if (arr[i] != 1 && arr[i] != 4) {
                System.out.println("false");
                c = 1;
                break;
            }
        }
            if(c==0)
                System.out.println("true");


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int x= sc.nextInt();
        Q5 obj =new Q5(x);
        System.out.println("Enter the elements of array");
        obj.arrayInput();
        obj.result();
    }
}
