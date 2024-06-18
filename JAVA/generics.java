class Gen<T>{
    T ob;
    Gen(T obj){
        ob=obj;
    }
    T getob(){
        return ob;
    }
}
public class generics {
    public static void main(String[] args) {
        Gen<Integer> iob=new Gen<Integer>(100);
        int value=iob.getob();
        System.out.println(value);

        Gen<String> sob=new Gen<String>("Harry");
        String str=sob.getob();
        System.out.println(str);
    }
}
