package LinkList;

public class MovingLastElement {
    public Node movingLastElement(Node head){
        Node last=null;
        Node curr=head;
        while(curr.next!=null && curr.next.next!=null){
             curr=curr.next;
        }
        last=curr.next;
        curr.next=null;
        last.next=head;
        head=last;
        return head;
    }
}
