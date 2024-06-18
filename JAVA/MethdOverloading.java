class Ar{
    int Rarea(int h,int w){
      return h*w;
    }
    int Sarea(int h){
      return h*h;
    }
}
public class MethdOverloading {
    public static void main(String[] args) {
        Ar x=new Ar();
        System.out.println (x.Rarea(10,20));
        System.out.println(x.Sarea(10));
    }
}
