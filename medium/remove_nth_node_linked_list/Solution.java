class Solution { 
    
    public ListNode removeNthFromEnd(ListNode head, int n) { 
         
        int length = 0; 
        ListNode currentNode = head; 
         
        
        while (currentNode != null) { 
            length++; 
            currentNode = currentNode.next; 
        }  
         
        if (length == 1) { 
            return null; 
        } else if (length == 2) { 
            if (n == 2) {
                return head.next; 
            } else {  
                head.next = null;
                return head; 
            }
        } 
           
        if (length - n == 0) { 
            return head.next; 
        } else { 
             
            int iterator = 0; 
            currentNode = head; 
             
            while (iterator != length - n -1) { 
                currentNode = currentNode.next; 
                iterator++;
            } 
             
            currentNode.next = currentNode.next.next; 
            
        } 
         
         return head;
        
    }
}