import java.util.Objects;

public class insertNodeInBeginningLinked {
    private Nodes head;

    public void insertIntheBeginning(int data){

        Nodes newNode = new Nodes(data);
        if (Objects.nonNull(head)){
            newNode.next = head;
        }
        head = newNode;
    }

    public static void main(String[] args) {
        insertNodeInBeginningLinked list = new insertNodeInBeginningLinked();
        list.insertIntheBeginning(40);
        list.insertIntheBeginning(20);

        displayLinkedList.displayList(list.head);

    }

}
