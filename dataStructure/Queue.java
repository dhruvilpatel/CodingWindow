package dataStructure;
import java.util.Stack;

class Queue<T>{
    
    Stack<T> st1 = new Stack<>();
    Stack<T> st2 = new Stack<>();
    
    public void Enqueue(T num){
        st1.push(num);
    }
    
    public void reOrganized(){
        if(st2.isEmpty()){
            while(!st1.isEmpty()){
                st2.push(st1.pop());
            }    
        }
    }
    public T Dequeue(){
            reOrganized();
            return st2.pop();
    }
}
