import java.util.Random;

public class random {
    public static void main(String[] args) {
             Random r=new Random();
             for(int i=0;i<2;i++){
                int val=r.nextInt();
                System.out.println(val);
             }   
    }
}
