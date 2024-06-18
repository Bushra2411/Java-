class X {
   int i,j;
  X(int a,int b){
    i=a;
    j=b;
  } 
  void show() {
    System.out.println("i="+i+" " +"j="+j);
  }
}
class Y extends X {
     int k;
    Y(int a,int b,int c){
        super(a,b);
        k=c;
    } 
    void show(){              //this is method overriding.
        super.show();         //this is for i and j output.
        System.out.println("k="+k);
    }
}
public class override {
    public static void main(String[] args) {
        Y z=new Y(1,2,3);
        z.show();

    }
}
