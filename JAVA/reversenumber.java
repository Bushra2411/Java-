class reverse{
    int num;
}
public class reversenumber {
    public static void main(String[] args) {
        reverse n=new reverse();
        n.num=395;
        int sum=0,temp,r;
        temp=n.num;
        while(temp!=0){
              r=temp%10;
              sum=sum*10+r;
              temp=temp/10;
        }
        System.out.println(sum);
    }
}
