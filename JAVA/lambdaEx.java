interface NumTest{
    boolean test(int n);
}
public class lambdaEx {
    public static void main(String[] args) {
             NumTest isEven=(n)->(n%2)==0;
             if(isEven.test(100))
                 System.out.println("even");
             if(!isEven.test(99))
                System.out.println("odd");    
    }
}
