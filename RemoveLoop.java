class main{
    public static void floydDetect(Node head){
        Node fast = head;
        Node slow = head;
      
        if(head.next == null) return null;
      
        while(fast != null && slow != null{
            fast = fast.next;
            if(fast.next != null) fast = fast.next;
            slow = slow.next;
          
            if(slow == fast) return slow;
        }
        
        return null;
    }
              
    public static void startNode(Node head){
        Node inter = floydDetect(head);
        Node slow = head;
      
        if(inter == null) return null;
      
        while(slow != inter)
            slow = slow.next;
            inter = inter.next;
      
        return slow;
    }
              
    public static void endLoop(Node head){
        if(head == null) return null;
      
        Node start = startNode(head);
        Node temp = start;
      
        while(temp.next != start) temp = temp.next;
      
        temp.next = null;
    }
        
}
