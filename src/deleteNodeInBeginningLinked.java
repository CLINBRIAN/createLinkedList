import java.awt.*;
import java.util.Objects;

public class deleteNodeInBeginningLinked {
    private Nodes head;
public void deleteNode(){
    if (Objects.nonNull(head)){
        head = head.getNext();
    }
}

    public static void main(String[] args) {
    deleteNodeInBeginningLinked list = new deleteNodeInBeginningLinked();
        Nodes first = new Nodes(10);
        Nodes second = new Nodes(20);
        Nodes third = new Nodes(30);
        Nodes fourth = new Nodes(40);

        list.head = first;
        first.setNext(second);
        second.setNext(third);
        third.setNext(fourth);

        list.deleteNode();

        displayLinkedList.displayList(list.head);

    }
}
