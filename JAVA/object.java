class ob{
    void square(int a,int b){
        a=a*a;
        b=b*b;
    }
}
public class object {
    public static void main(String[] args) {
        int a=10,b=20;
        ob n=new ob();
        System.out.println(a+" "+b);
        n.square(a,b);
        System.out.println(a+" "+b);
    }
}
