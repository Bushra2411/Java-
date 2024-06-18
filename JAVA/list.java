 import java.util.ArrayList;

public class list {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Sami");
        al.add("fabiha");
        al.add("keya");
        al.add("paplu");
        System.out.println("Elements"+al);
        al.remove("keya");
        //al.remove(1);
        System.out.println("elements"+al);
    }
}
