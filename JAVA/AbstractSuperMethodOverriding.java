class shape {
    double d1,d2;
    shape(double a,double b){
        d1=a;
        d2=b;
    }
    double area(){
        System.out.println("area is undefined");         //DMD
        return 0;
    }
}
class r extends shape{
    r(double a,double b){
        super(a,b);
    }
    double area(){
        return d1*d2;
    }
}
                                      //DMD
class tri extends shape{
    tri(double c,double d){
        super(c,d);
    }
    double area(){
        return d1*d2/2;
    }
}
public class AbstractSuperMethodOverriding {
     public static void main(String[] args) {
          r l=new r(10,20);
          tri t =new tri(10,20);
          shape s;
          s=l;
          System.out.println(s.area());
          s=t;
          System.out.println(s.area());
     }
}
