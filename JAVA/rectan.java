class rec{
    int height,width;
    int a(){
        return height*width;
    }
    rec(int h,int w){
         height=h;
        width=w;
    }
}
public class rectan {
    public static void main(String[] args) {
        rec n=new rec(2,3);
        int area = n.a();
        System.out.println(area);
    }
}
