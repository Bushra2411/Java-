class num{
    int i;
    float f;
    int myabs (int i){
        return i>0?i:-i;
    }
    double myabs(double f){
         return f>0?f:-f;
    }
}
public class methodoverloading {
    public static void main(String[] args) {
        num n=new num();
        System.out.println(n.myabs(-10));
        System.out.println(n.myabs(-10.5));
    }
}
