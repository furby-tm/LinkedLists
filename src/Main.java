public class Main {

    public static void main(String[] args) {
        LinkList theLinkedList = new LinkList();

        theLinkedList.insertFirstLink("Don Quixote", 500);
        theLinkedList.insertFirstLink("A Tale of Two Cities", 200);
        theLinkedList.insertFirstLink("The Lord of the Rings",150);
        theLinkedList.insertFirstLink("Harry Potter and the Sorcerer's Stone",107);

        theLinkedList.display();
    }
}
