Node remove(Node head){
  Node curr = head;
  
  while(curr != null){
    Node temp = curr.next;
    if(curr.next != null && temp.data == curr.data){
      Node nextNext = curr.next.next;
      curr.next = nextNext;
    } else{
      curr = curr.next;
    }
  }
  return head;
}
