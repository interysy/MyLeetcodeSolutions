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
     
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) { 
         
        ListNode currentListOne  = list1; 
        ListNode currentListTwo = list2; 
        if (currentListOne == null && currentListTwo == null) { 
            return null;
        } else if (currentListOne == null) {  
            return currentListTwo;
        } else if (currentListTwo == null) { 
            return currentListOne; 
        } 
        ListNode previousNode = null;  
        ListNode starterNode = null;
        while (currentListOne != null && currentListTwo != null) { 
            ListNode newNode = new ListNode(); 
            // newNode.val = (currentListOne.val < currentListTwo.val) ?  currentListTwo.val : currentListOne.val;  
            if (currentListOne.val > currentListTwo.val) { 
                newNode.val = currentListTwo.val;  
                 currentListTwo = currentListTwo.next; 
            } else {
                newNode.val = currentListOne.val; 
                currentListOne = currentListOne.next; 
            } 
            
            if (previousNode != null) { 
                previousNode.next = newNode; 
            } else { 
                starterNode = newNode; 
            }
            previousNode = newNode; 
        
        } 
         
        if (currentListOne != null) {  
            previousNode.next = currentListOne; 
        } else if (currentListTwo != null) { 
            previousNode.next = currentListTwo; 
        }  
        return starterNode; 
    }
}