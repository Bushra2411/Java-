class ff{
    int fact(int n){
        if(n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
}
public class recursionfact {
    public static void main(String[] args) {
        ff f=new ff();
        int F=f.fact(5);
        System.out.println(F);
    }
}
