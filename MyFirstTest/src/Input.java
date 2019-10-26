import java.util.Scanner;

public class Input {
    public static void main(String [] args){
        String s = new String("Put samsing");
        Scanner inp = new Scanner(System.in);
        System.out.println(s);
        String string = inp.nextLine();
        System.out.println("You put: "+string);
    }
}
