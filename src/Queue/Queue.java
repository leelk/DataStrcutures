package Queue;

public class Queue {

    int queue[] = new int[5];

    int size;
    int front;
    int rear;


    public void enque(int data){

        queue[rear] = data;
        rear++;
        size++;
    }

    public void deQueue(){

        front++;
        size--;

    }




    public void print(){

        for (int i = 0; i < size; i++) {
            System.out.print(queue[i] + " ");
        }
    }
}
