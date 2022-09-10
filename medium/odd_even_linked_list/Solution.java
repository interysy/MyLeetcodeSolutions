/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */ 
 
 
class Solution { 
    
    public ListNode oddEvenList(ListNode head) { 
           
        if (head == null || head.next == null || head.next.next == null ) { 
            return head; 
        } 
        
        int index = 3; 
        ListNode currentNode = head.next.next; 
        ListNode firstEven = head.next; 
        ListNode firstOdd = head; 
        ListNode lastEven = head.next; 
        ListNode lastOdd = head;   
        
        
        while (currentNode != null) { 
            if (index % 2 == 0) { 
                lastEven.next = currentNode;  
                lastEven = currentNode;
            } else { 
                lastOdd.next = currentNode; 
                lastOdd = currentNode;
            } 
            currentNode = currentNode.next;  
            index++;
         
        } 
         
        lastEven.next = null; 
        lastOdd.next = firstEven;
         
         return head;
        
    }
}