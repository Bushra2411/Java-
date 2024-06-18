import java.util.*;
public class hasnext {
    public static void main(String[] args) {
        Scanner cin =new Scanner(System.in);
        int i;
        System.out.println("enter a number: ");
        while (cin.hasNextInt()) {
            i= cin.nextInt();
            System.out.println(i);
        }
    }
}
