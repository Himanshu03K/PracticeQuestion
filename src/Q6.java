/*
Q6. Write a program to reverse the elements of a given 2*2 array. Four integer numbers needs to be passed as Command Line arguments.

Example1)
C:\>java Sample 1 2 3
O/P: Please enter 4 integer numbers

Example2)
C:\>java Sample 1 2 3 4
O/P:
 The given array is :
  1 2
  3 4
 The reverse of the array is :
  4 3
  2 1

Two dimensional Array
 */


import java.util.Scanner;
public class Q6 {
    int[][] arr;
    Q6(String a[])
    {
        arr= new int [2][2];
        var k=0;
        for (var i = 0; i < 2; i++) {
            for (var j = 0; j < 2; j++) {
                arr[i][j]=Integer.parseInt(a[k++]);
            }
        }

    }

    public void reverse() {
        System.out.println("The given array is :");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(arr[i][j]+"\t");
            System.out.println();
        }
        System.out.println("The reverse array is :");
        for (int i = 1; i >=0; i--) {
            for (int j = 1; j >=0; j--)
                System.out.print(arr[i][j]+"\t");
            System.out.println();
        }
    }

    public static void main(String[] args) {

        if(args.length!=4)
            System.out.println("Please enter 4 integer numbers");
        else{
            //Q6 obj=new Q6(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]),Integer.parseInt(args[3]));
            Q6 obj=new Q6(args);
            obj.reverse();
            }
        }
    }

