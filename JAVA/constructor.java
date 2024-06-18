class cons{
    int height,width,depth;
    int volume(){
        return height*width*depth;
    }
    cons(int h,int w,int d){  //cons is one kind of method which is the same name of class
        height=h;
        width=w;
        depth=d;
    }
}
public class constructor {
    public static void main(String[] args) {
        cons b=new cons(10,10,30);
        int v=b.volume();
        System.out.println(v);
    }
}
