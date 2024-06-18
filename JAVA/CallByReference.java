class CBR{
    int x,y;
    CBR(int i,int j){
       x=i;
       y=j;
    }
    boolean equals(CBR c){
        if(x==c.x && y==c.y)
           return true;
        else
            return false;   
    }

}
public class CallByReference {
    public static void main(String[] args) {
        CBR c1=new CBR(5, 5);
        CBR c2=new CBR(5, 6);
        if(c1.equals(c2));
        System.out.println("EQUAL");
        else
        System.out.println("NOT EQUAL");
       
    }
}
