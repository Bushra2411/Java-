 class XOB {
    double width,height,depth;
    XOB(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }
    double Volume (){
        return width*height*depth;
    }
}
    class boxweight extends XOB {
        double weight;
        boxweight(double w,double h,double d,double g){
            super(w,h,d);                                //super keyword.
            weight=g;
        }
        double getweight(){
            return weight;
        }
    }
public class inheritance {
    public static void main(String[] args) {
        boxweight BW = new boxweight(10, 20, 30, 40);
        System.out.println(BW.Volume());
        System.out.println(BW.getweight());
    }
}
