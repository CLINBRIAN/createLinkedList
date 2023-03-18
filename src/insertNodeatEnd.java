import java.util.Objects;

public class insertNodeatEnd {
    private Nodes head;

    public void insertNodeinEnd(int data){

        Nodes node = new Nodes(data);

        if (Objects.isNull(head)){   //if there are no nodes
           head = node;
        }
        else{
            Nodes temp = head;
            while (Objects.nonNull(temp.getNext())){  //if there are nodes, add a new node in the end of linkedlist
                temp = temp.getNext();
            }
            temp.setNext(node);

        }
    }

    public static void main(String[] args) {

        insertNodeatEnd list = new insertNodeatEnd();

        list.insertNodeinEnd(10);
        list.insertNodeinEnd(40);
        displayLinkedList.displayList(list.head);
    }
}
