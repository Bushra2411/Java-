class C{
    int i,j;
    void showij (){
        System.out.println(i+" and "+j);
    }
}
class D extends C {
    int k;
    void showijk() {
        showij();
        System.out.println(k);
}
}
public class inherte {
    public static void main(String[] args) {
        C ob=new C();
        ob.i=10;
        ob.j=100;
        ob.showij();

       D obD=new D();
       obD.i=10;
       obD.j=100;
       obD.k=1000;
       obD.showijk();
      

    }
}
