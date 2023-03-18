public class createLinkedList {
    /* 1.Head node
             2.Node with data and reference to next node
             3.last node -> null
          */
    private Nodes head;
    public static void main(String[] args) {
        Nodes first = new Nodes(10);
        Nodes second = new Nodes(20);
        Nodes third = new Nodes(30);
        Nodes fourth = new Nodes(40);
        Nodes fifth = new Nodes(50);
        Nodes sixth = new Nodes(60);


         //connect nodes together to form a chain of linked list

        createLinkedList list = new createLinkedList();
        list.head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next= fifth;
        fifth.next = sixth;
        sixth.next = null;

        displayLinkedList.displayList(list.head);


    }
}
