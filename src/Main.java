import Array.MyArray;
import LinkedList.LinkedList;
import Queue.Queue;
import Stack.Stack;

public class Main {

    public static void main(String[] args) {

/*        MyArray myArray = new MyArray(5);
        myArray.insert(10);
        myArray.insert(20);
        myArray.insert(20);
        myArray.insert(30);
        myArray.insert(140);
        myArray.insert(140);
        myArray.insert(140);
        System.out.println("Size of array is: "+ myArray.size());
        System.out.println("Index is: "+myArray.indexOf(140));
        myArray.print();*/


       /* LinkedList list = new LinkedList();
        list.insert(18);
        list.insert(54);
        list.insert(52);
        list.insert(15);
        list.insertAtStrar(22);
        list.insertAt(2,25);
        list.deleteAt(2);

        list.show();*/

/*
        Stack stack = new Stack();
        stack.push(25);
        stack.push(20);
        stack.push(410);
        stack.push(140);
        stack.pop();
        stack.push(140);
        stack.print();*/


        Queue queue = new Queue();
        queue.enque(25);
        queue.enque(30);
        queue.enque(35);
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();

     //   25 30 35 0 0
//        35 30 35 0 0
        queue.print();

    }
}
