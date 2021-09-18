/*
Q3. Initialize an integer array with ascii values and print the corresponding character values in a single row.
 */


public class Q3 {
    public int arr[],k=0;

    Q3()
    {
    arr = new int[26];
    for(int i =65;i<=90;i++)
        arr[k++]=i;
    }

    public void result(){
        for (int i = 0; i < k; i++) {
            System.out.print((char)arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Q3 obj = new Q3();
        obj.result();
    }
}
