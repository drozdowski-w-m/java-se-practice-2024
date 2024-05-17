package pl.globallogic.exercises.ex47;

public class AbstractClass {
    public static void main(String[] args) {
        ListItem item1 = new Node(10);
        ListItem item2 = new Node(20);
        ListItem item3 = new Node(15);
        ListItem item4 = new Node(25);
        ListItem item5 = new Node(5);

        MyLinkedList myLinkedList = new MyLinkedList(item1);

        myLinkedList.addItem(item2);
        myLinkedList.addItem(item3);
        myLinkedList.addItem(item4);
        myLinkedList.addItem(item5);

        System.out.println("Traversing the list:");
        myLinkedList.traverse(myLinkedList.getRoot());

        System.out.println("Remove item with value 15");
        myLinkedList.removeItem(item3);

        System.out.println("Traversing after removal");
        myLinkedList.traverse(myLinkedList.getRoot());

    }
}
