public class Solution {
    public boolean hasCycle(ListNode head) {
        while (head != null){
            if(head.val == 1_000_000) return true;
            head.val = 1_000_000;
            head = head.next;
        }
        return false;
    }
}


//Floyd Cycle Detection Algorithm
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        
       if(head == null || slow.next == null) return false;
       
       while(fast != null && slow != null)
           fast = fast.next;
           if(fast != null) fast = fast.next;
           slow = slow.next;
           
           if(fast == slow) return true;
    }
    return false;
}
