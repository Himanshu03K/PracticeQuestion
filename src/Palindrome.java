/*
Q1. write a Java program to find if the given number is palindrome or not

Example1)
C:\>java Sample 110011
O/P: 110011 is a palindrome

Example2)
C:\>java Sample 1234
O/P: 1234 is not a palindrome

 */


public class Palindrome {
    public int pali;
    Palindrome(int p)
    {
        pali= p;
    }

    public void Pali_check(){
        var c = pali;
        var pal =0;
        while(c>0){
            var r=c%10;
            pal = pal*10 +r;
            c=c/10;
        }
        if(pali == pal)
            System.out.println(pali+" is a Palindrome");
        else
            System.out.println(pali+" is not a Palindrome");
    }

    public static void main(String[] args) {
        Palindrome obj = new Palindrome(Integer.parseInt(args[0]));
        obj.Pali_check();
    }
}
