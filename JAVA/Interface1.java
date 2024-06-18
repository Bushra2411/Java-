interface A{
    void method1();
    void method2();
}
interface B extends A{
    void method3();
}
class MyClass implements B{
    public void method1(){
        System.out.println("method 1 implemented");
    }
    public void method2(){
        System.out.println("method 2 implemented");
    }
    public void method3(){
        System.out.println("method 3 implemented");
    }
}

public class Interface1 { 
        public static void main(String[] args){
            MyClass ob=new MyClass();
            ob.method1();
            ob.method2();
            ob.method3();
        }
    }
