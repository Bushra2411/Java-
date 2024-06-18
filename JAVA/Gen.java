 class M<T extends Comparable>{
    T [] vals;
    M(T[] o){
        vals=o;
    }
     T getmax(){
       T v=vals[0];
       for(int i=1;i<vals.length;i++)
         if(vals[i].compareTo(v)>0)
            v=vals[i];
            return v;
    }
}
public class Gen {
    public static void main(String[] args) {
        Integer I[]={10,50,40};
        Double D[]={3.14,5.6,10.001};
        String S[]={"NEUB","JAVA","CLASS"};

        M <Integer> iob = new M<Integer>(I);
        M <Double> dob =new M<Double>(D);
        M <String> sob = new M<String>(S);

        System.out.println(iob.getmax());
        System.out.println(dob.getmax());
        System.out.println(sob.getmax());
    }
}
