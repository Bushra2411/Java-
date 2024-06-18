class digits{
    int num;
}
public class sumofdigits {
    public static void main(String[] args) {
        digits n=new digits();
        n.num=547;
        int sum=0,temp,r;
        temp=n.num;
        while(temp!=0){
            r=temp%10;
            sum=sum+r;
            temp=temp/10;
        }
        System.out.println(sum);

    }
}
