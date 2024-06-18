public class Boolean {
    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6,7,8,9,0};
        int item=115;
        boolean found=false;
        for(int x:num){
            if(x==item) found=true;
        }
        if(found)
        System.out.println("item found");
        else
        System.out.println("not found");
    }
}
