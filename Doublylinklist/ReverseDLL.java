package Doublylinklist;

public class ReverseDLL {
    public Node reversingdll_1(Node head){
        Node curr=head;
        Node Next=null;
        while(curr!=null){
            Node temp=curr.next;
            curr.next=Next;
            Next=curr;
            curr.prev=temp;
            curr=temp;
        }
        return Next;
    }
}
