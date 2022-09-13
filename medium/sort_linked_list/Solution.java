package medium.sort_linked_list;

public /**
* Definition for singly-linked list.
* public class ListNode {
*     int val;
*     ListNode next;
*     ListNode() {}
*     ListNode(int val) { this.val = val; }
*     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
* }
*/  

// implemented using pseudocode for LL Merge Sort from ADS 2 lectures @ University Of Glasgow
class Solution {
   public ListNode sortList(ListNode head) { 
         
       if (head == null || head.next == null) { 
           return head; 
       } 
        
       ListNode[] result = splitList(head); 
       ListNode x = sortList(result[0]); 
       ListNode y = sortList(result[1]); 
       return mergeLists(x , y);   
   } 
      
   
    
   public ListNode mergeLists(ListNode listOne , ListNode listTwo) { 
       if (listOne == null) { 
           return listTwo; 
       } else if (listTwo == null) { 
           return listOne;     
       } 
       ListNode x = null; 
       if (listOne.val <= listTwo.val) { 
           x = listOne; 
           x.next = mergeLists(listOne.next , listTwo);
       } else { 
           x = listTwo; 
           x.next = mergeLists(listOne,listTwo.next); 
       } 
       return x;
   }
   
    
   public ListNode[] splitList(ListNode head) {  
       ListNode[] result = new ListNode[2];
       if (head == null || head.next == null) { 
           result[0] = head; 
           result[1] = null;
       }   
        
       ListNode slowPointer = head; 
       ListNode fastPointer = head.next;  
       ListNode middlePointer;
        
       while (fastPointer != null && fastPointer.next != null) { 
           slowPointer = slowPointer.next; 
           fastPointer = fastPointer.next.next;  
       } 
       middlePointer = slowPointer.next; 
       slowPointer.next = null; 
       result[0] = head; 
       result[1] = middlePointer; 
       return result; 
       
       
   }
} 

Solution {
    
}
