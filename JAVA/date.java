import java.util.Date;

public class date {
    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(d);

        long t= d.getTime();
        System.out.println(t);
    }
}
