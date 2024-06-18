import java.util.*;
public class universal {
    public static void main(String[] args) {
        Scanner cin =new Scanner(System.in);
        double d;
        int i;
        String st;
        System.out.println("enter a number: ");
        while (cin.hasNext()) {
            if(cin.hasNextInt()){
            i= cin.nextInt();
            System.out.println(i+" ");
            }

            else if(cin.hasNextDouble()){
            d= cin.nextDouble();
            System.out.println(d+" ");
            }

            else{
                st=cin.next();
                if(st.equals("end")) return; //end print na korte chaile
                System.out.println(st+" ");
                //if(st.equals("end")) return;
            }
        }
    }
}
