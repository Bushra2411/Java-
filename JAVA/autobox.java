
public class autobox {

    static int method(Integer V){     //auto box
        return V;                     //auto unbox  
    }
    public static void main(String[] args) {
        Integer iob=  method(1000);
        System.out.println(iob);
    }
}
