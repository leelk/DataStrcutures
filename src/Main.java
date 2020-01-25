public class Main {

    public static void main(String[] args) {

        MyArray myArray = new MyArray(5);

        myArray.insert(10);
        myArray.insert(20);
        myArray.insert(20);
        myArray.insert(30);
        myArray.insert(140);
        myArray.insert(140);
        myArray.insert(140);

        System.out.println("Size of array is: "+ myArray.size());

        System.out.println("Index is: "+myArray.indexOf(140));
        myArray.print();
    }
}
