/*
Q4. Write a program to print the sum of the elements of an array following the given below condition.

If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the other numbers for calculation of sum.

Eg1) Array Elements - 10,3,6,1,2,7,9
O/P: 22
[i.e 10+3+9]

Eg2) Array Elements - 7,1,2,3,6
O/P:19

Eg3) Array Elements - 1,6,4,7,9
O/P:10

 */

import java.util.*;
import java.util.stream.Stream;

public class Q4 {
    public int arr[];
    Q4(int ar[])
    {
        arr= ar;
    }
    public void check(){
        int a=0,b=0,sum=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 6)
                a = i;
            else if (arr[i] == 7)
                b = i;
        }
            if(a<b)
            {
                for (int i = 0; i < arr.length; i++){
                    if((i)==a)
                        i=i+(b-a+1);
                    sum=sum+arr[i];
                }
            }
            else {
                for (int i = 0; i < arr.length; i++)
                {
                    sum = sum + arr[i];
                }
            }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Q4 obj=new Q4(Stream.of(args).mapToInt(s->Integer.parseInt(s)).toArray());
        obj.check();
    }
}
