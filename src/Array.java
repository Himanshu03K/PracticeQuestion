import java.util.Scanner;
public class Demo {
    public int arr[];

     Demo( int n){
         arr=new int[n];

     }
     public void input() {
         Scanner sc = new Scanner(System.in);
         for (int i = 0; i < arr.length; i++) {
             arr[i] = sc.nextInt();
         }
     }
         public void Result(int x){
             int c=0;
             for(int i=0;i<arr.length;i++){
                 if(arr[i]==x){
                     System.out.println(i);
                     c=1;
                     break;
                 }
         }
         if(c==0)
             System.out.println("-1");

     }

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the length of the array");
        int n=sc.nextInt();
        Demo obj=new Demo(n);
        System.out.println("Enter the Array");
        obj.input();
        System.out.println("Enter the Element to found:");
        int s=sc.nextInt();
        obj.Result(s);
    }
}
