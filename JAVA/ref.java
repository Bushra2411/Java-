class coord{
    int x,y;
    coord(int i,int j){
        x=i;                //it is a constructor.
        y=j;
    }
    boolean equals(coord c){
    if(x==c.x && y==c.y)       //both object should be same.
    return true;
    else 
    return false;
    }
}
public class ref {
     public static void main(String[] args) {
        coord c1=new coord(20,30);
        coord c2=new coord(20,30);
        if(c1.equals (c2))                //call by reference.
        System.out.println("object are equal");
        else
        System.out.println("not equal");
    }
}
