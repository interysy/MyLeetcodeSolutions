class SolutionStackAndQueue {
    public boolean isPalindrome(ListNode head) { 
         
         Deque<Integer> stack = new ArrayDeque<Integer>();
         Queue<Integer> queue = new ArrayDeque<Integer>();
         int counter = 0; 
        
        ListNode currentNode = head;  
        
        while (currentNode != null) { 
            counter++; 
            stack.push(currentNode.val); 
            queue.add(currentNode.val); 
            currentNode = currentNode.next;
        } 
         
        for (int i = 0 ; i < counter ; i++) { 
            if (stack.pop() != queue.remove()) { 
            return false;
            } 
        } 
        return true; 
        
    }
} 
 

class SolutionStack {
    public boolean isPalindrome(ListNode head) { 
         
        Deque<Integer> stack = new ArrayDeque<Integer>();
        int counter = 0; 
        
        ListNode currentNode = head;  
        
        while (currentNode != null) { 
            counter++; 
            stack.push(currentNode.val); 
            currentNode = currentNode.next;
        }  
        currentNode = head;
         
        for (int i = 0 ; i < counter ; i++) { 
            if (stack.pop() != currentNode.val) { 
                return false;
            }  
            currentNode = currentNode.next; 
        } 
        return true; 
        
    }
}