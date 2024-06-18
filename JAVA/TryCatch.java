import java.util.*;
public class TryCatch {
    public static void main(String[] args){
           try{
            int a=1;
                System.out.println("a=" + a);
            int b=42/a;
            int c[]={1};
            c[10]=99;
           }catch(ArithmeticException e){
                System.out.println("divides by zero occurs");
               //  b=0;
           }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("array index out of bounds occurs: "+e);
           }finally{
            int b=0;
       System.out.println("try catch is finished");
           }
    }
}
