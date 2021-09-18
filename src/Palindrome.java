/*
Q1. write a Java program to find if the given number is palindrome or not

Example1)
C:\>java Sample 110011
O/P: 110011 is a palindrome

Example2)
C:\>java Sample 1234
O/P: 1234 is not a palindrome

 */




import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int c = x;
        var pal =0;
        while(c>0){
            var r=c%10;
            pal = pal*10 +r;
            c=c/10;
        }
        if(x==pal)
            System.out.println(x+" is a Palindrome");
        else
            System.out.println(x+" is not a Palindrome");
    }
}
