import java.util.Objects;

public class displayLinkedList {
    public static void displayList(Nodes head){
        Nodes temp = head;
        while (Objects.nonNull(temp)){                             // while (temp != null)
            System.out.print(temp.getData() + " -> ");
            temp = temp.next;
        }
        System.out.println("null");

    }
}
