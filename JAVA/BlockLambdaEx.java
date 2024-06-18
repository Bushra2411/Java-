interface Func{
    int fact(int n);
}
public class BlockLambdaEx {
    public static void main(String[] args) {
        Func f=(n)->{
            int v=1;
            for(int i=2;i<=n;i++)
                v=v*i;
                return v;  
        };
         System.out.println(f.fact(5));
    }
}
