package Stack;

public class Stack {


    int stack[] = new int[5];
    int top;

    public void push(int data){

        stack[top] = data;
        top++;
    }


    public void print(){
        for (int i = 0; i < stack.length; i++) {
            System.out.print(stack[i] + " ");
        }
    }


    public void pop(){
        top--;
        int data;
        data = stack[top];
        stack[top] = 0;
    }
}
