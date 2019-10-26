import java.util.Scanner;

public class DoWhile {
    public static void main(String [] args){
        int i,k=0;
        int[] arr = new int[10];
        System.out.println("Start ....");
        Scanner in = new Scanner(System.in);
        do{
        System.out.println("Put some number");
        i= in.nextInt();
        arr[k]=i;
        k++;
        } while(i!=5&&k<arr.length);

        for(int r:arr) System.out.println(r);
    }
}
