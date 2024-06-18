class Constr {
    int height,width,depth;
    int volume() {
        return height*width*depth;
    }
    Constr(int h,int w,int d){
        height=h;
        width=w;
        depth=d;
    }
}
public class cons {
    public static void main(String[] args){
        Constr obj=new Constr(10,20,30);
        System.out.println(obj.volume());
    }
}
