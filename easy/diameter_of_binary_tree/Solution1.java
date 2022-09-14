/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */ 

class Solution1 { 
     
    int longest = 0; 
    
    public int diameterOfBinaryTree(TreeNode root) {   
        return diameterOfBinaryTreeInner(root, root); 
    } 
     
    public int diameterOfBinaryTreeInner(TreeNode root, TreeNode firstNode) { 
        
        if (root == null) { 
            return 0; 
        } 
          
        int diameterLeft = 0;
        int diameterRight = 0;  
        
        if (root.left != null) { 
             diameterLeft = diameterOfBinaryTreeInner(root.left , firstNode) + 1;   
        } 
         
        if (root.right != null) { 
             diameterRight = diameterOfBinaryTreeInner(root.right  , firstNode) + 1;     
        } 
         
        if (diameterLeft+diameterRight > this.longest) { 
            this.longest = diameterLeft+diameterRight;    
        } 
          
        if (root == firstNode) {  

            if(this.longest > diameterLeft && this.longest > diameterRight) {
                return this.longest;
            } else if (diameterLeft > diameterRight) { 
                return diameterLeft; 
            } else { 
                return diameterRight; 
            }
        }

       
        return Math.max(diameterLeft , diameterRight);
          
     
    
    
    }
}
