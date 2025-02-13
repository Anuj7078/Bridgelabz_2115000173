import java.util.*;
class Queue{
    Stack<Integer>input=new Stack<>();
    Stack<Integer>output=new Stack<>();
    public Queue() {
    }
    public void push(int x) {
        System.out.println("The element pushed is " + x);
        input.push(x);
    }
    public int pop(){
        if(output.empty())
           while(!input.empty()){
                output.push(input.peek());
                input.pop();
            }
        int x = output.peek();
        output.pop();
        return x;
    }
    public int peek(){
        if(output.empty())
            while(!input.empty()){
                output.push(input.peek());
                input.pop();
            }
        return output.peek();
    }
    int size(){
        return (output.size()+input.size());
    }
}
public class QueueByStack{
    public static void main(String args[]){
        Queue q=new Queue();
        q.push(1);
        q.push(2);
        System.out.println("The element poped is " + q.pop());
        q.push(3);
        System.out.println("The top element is " + q.peek());
        System.out.println("The size of the queue is " + q.size());
    }
}