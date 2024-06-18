import java.util.*;
public class hassum {
    public static void main(String[] args) {
        Scanner cin =new Scanner(System.in);
        int i, sum=0;
        System.out.println("enter a number: ");
        while (cin.hasNextInt()) {
            i= cin.nextInt();
            sum=sum+i;
            System.out.println(i+" ");
        }
        System.out.println("sum= "+sum);
    }
}
