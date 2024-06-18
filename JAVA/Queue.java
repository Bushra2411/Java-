class Que{
    int s[]=new int[10];
    int top=0;
    int temp=0;
    void enqueue(int item){
        s[top]=item;
        top++;
    }
    int dequeue(){
        top--;
        temp=s[0];
        return temp;
        
    }
}
public class Queue {
    public static void main(String[] args) {
        Que myQue=new Que();
        myQue.enqueue(5);
        myQue.enqueue(7);
        myQue.enqueue(9);
        myQue.enqueue(11);

        System.out.println(myQue.dequeue());
        System.out.println(myQue.dequeue());
    }
}
