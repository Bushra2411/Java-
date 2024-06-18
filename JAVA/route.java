class Num {
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
    int sum(int a,int b,int c,int d){        //method overloading
        return a+b+c+d;
    }
}
public class route {
    public static void main(String[] args) {
    Num n=new Num();
    System.out.println(n.sum(10,20));
    System.out.println(n.sum(10,20,30));
    System.out.println(n.sum(10,20,30,40));
    }
}
