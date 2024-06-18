interface MaxMin<T extends Comparable<T>>{
    T max();
}
class MyClass<T extends Comparable>{
    T[] vals;
    MyClass(T[] o){
        vals=o;
    }

    public T max(){
        T v=vals[0];
        for(int i=1;i<vals.length;i++)
            if(vals[i].compareTo(v)>0) 
               v=vals[i];
               return v;
        
    }
}
public class Maxi {
    public static void main(String[] args) {
        Integer I[]={10,20,30};
        String S[]={"Neub","JAVA","CLASS"};

        MyClass <Integer> iob=new MyClass<Integer>(I);
        MyClass <String> sob=new MyClass<String>(S);

        System.out.println(iob.max());
        System.out.println(sob.max());
    }
}
