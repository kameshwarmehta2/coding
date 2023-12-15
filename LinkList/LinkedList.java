package LinkList;
class Node{
    int val;
    Node next=null;
}
public class LinkedList{
    public static void main(String[] args){     
        int[] arr={1,2,3,4,5};
        Node head=null;
        Node curr=null;
        MovingLastElement obj=new MovingLastElement();
        
        for(int i=0;i<arr.length;i++){
            Node n=new Node();
            n.val=arr[i];
            if(head==null){
                head=n;
                curr=n;
            }
            else{
                curr.next=n;
                curr=n;
            }
           
         }
         printing(head);
         head=obj.movingLastElement(head);
         printing(head);
          
    }
    
    public static void printing(Node head){
        Node curr=head;
        int i=0;
        while(curr!=null){
            if(i==0){
              System.out.print(curr.val);
              curr=curr.next;
            }
            else{
               System.out.print("->" + curr.val);
               curr=curr.next;
            }
            i++;
        }
        System.out.println();
    }
   
    
} 
