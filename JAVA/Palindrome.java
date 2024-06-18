import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0,temp,r;
        temp=num;
        while(temp!=0){
                r=temp%10;
                sum=sum*10+r;
                temp=temp/10;
            }
            if(num==sum){
                System.out.println("Palindrom");
            }
            else{
                System.out.println("not Palindrom");
            }
    }
}
