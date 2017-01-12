public class SinglyLinkedList{

   Node next = null;
   int data;
   
   public Node(int d){data = d;}
   
   public void appendToTail(int d){
   
      Node end = new Node(d);
      Node n = this;
      
      while(n.next != null){n = n.next;}
      n.next = end;
      
   }
   
   public Node deleteNode(Node head, int d){
       
       Node n = head;
       if(n.data == d){
       
          return head.next;
       
       }
       while(n.netxt != null){
           
           if(n.next.data == d){
              
              n.next = n.next.next;;
              return head;
           
           }
           
           n = n.next;
       }
   
   }
}