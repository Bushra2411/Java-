class A{
    void show(){
        System.out.println("In A");
    }
}
class B extends A{
    void show(){
        System.out.println("In B");
    }
}
class C extends A{
    void show(){
        System.out.println("In C");
    }
}

public class DMD {
    public static void main(String[] args) {
        A a= new A();
        B b=new B();
        C c=new C();
        A r;
        
        r=a;
        r.show();

        r=b;
        r.show();

        r=c;
        r.show();
    }
}