import java.util.Objects;

public class deleteNodeFromEnd {
    private Nodes head;
    public void deleteNode(){
        if (Objects.nonNull(head)){
            Nodes temp = head;
            //so is it has only one node,
            if (Objects.isNull(temp.getNext())){
                head = temp.getNext();
            }
            else {
                while (Objects.nonNull(temp.getNext().getNext())){
                    temp = temp.getNext();
                }
                temp.setNext(null);
            }

        }
        else
             System.out.println("LinkedList is empty");

    }
    public static void main(String[] args) {
        deleteNodeFromEnd list = new deleteNodeFromEnd();
        Nodes first = new Nodes(10);
        Nodes second = new Nodes(20);
        Nodes third = new Nodes(30);
        Nodes fourth = new Nodes(40);
        Nodes fifth = new Nodes(50);

        list.head = first;
        first.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(fifth);


        displayLinkedList.displayList(list.head);
        list.deleteNode();
        displayLinkedList.displayList(list.head);
    }
}
