package Doublylinklist;

import java.util.Scanner;
class Node{
    int val;
    Node next=null;
    Node prev=null;
}
public class Doublyll {
    public static void main(String[] args){  
        ReverseDLL obj=new ReverseDLL();
        int[] array=user_array();
        Node head=null;
        Node curr=null;
        Node tail=null;
        
        for(int i=0;i<array.length;i++){
            Node n=new Node();
            n.val=array[i];
            if(head==null){
                head=n;
                head.prev=null;
                curr=n;
            }
            else{
                Node temp=curr;
                curr.next=n;
                curr=n;
                tail=curr;
                curr.prev=temp;
            }
        }
       
        
        Node temp_head=obj.reversingdll_1(head);
        printing(temp_head);
        printing_2(head);
   }
     public static int[] user_array(){
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the size of the array: ");
          int size = sc.nextInt();
          int[] arr = new int[size];
          System.out.println("Enter the elements of the array:");
          for (int i = 0; i < size; i++) {
             System.out.print("Element " + (i + 1) + ": ");
             arr[i] = sc.nextInt();
          }
          return arr;
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
     public static void printing_2(Node tail){
        Node curr=tail;
        int i=0;
        while(curr!=null){
            if(i==0){
              System.out.print(curr.val);
              curr=curr.prev;
            }
            else{
               System.out.print("->" + curr.val);
               curr=curr.prev;
            }
            i++;
        }
        System.out.println();
    }
}
