abstract class Figure {
      double d1,d2;
      Figure(double a,double b){
        d1=a;
        d2=b;
      }
      abstract double area();   //abstract class
    }
      class Rec extends Figure{
        Rec(double a,double b){
            super(a,b);
        }
        double area(){
            return d1*d2;
        }
      }

      class Tri extends Figure{
        Tri(double a,double b){
            super(a,b);
        }
        double area(){
            return 0.5*d1*d2;
        }
      }


public class Abstract {
    public static void main(String[] args){
    Rec r=new Rec(10,20);
    Tri t=new Tri(10,20);
    Figure f;    //(this is a figure type reference)
          f=r;
          System.out.println(f.area());
          f=t;
          System.out.println(f.area());
    }
}
