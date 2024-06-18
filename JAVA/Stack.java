
class stk{
    int s[]=new int[10];
    int top=0;
    void push(int item){
        s[top]=item;
        top++;
    }
    int pop(){
        top--;
        return s[top];
    }
}
public class Stack {
    public static void main(String[] args) {
    stk mystk=new stk();
    mystk.push(100);
    mystk.push(200);
    mystk.push(300);
    mystk.push(400);
    
    System.out.println(mystk.pop());
    System.out.println(mystk.pop());
    }
}
