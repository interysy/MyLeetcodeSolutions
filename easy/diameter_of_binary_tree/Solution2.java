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

class Solution2 { 
     
    int longest = 0;   
      
    public int diameterOfBinaryTree(TreeNode root) { 
        
        diameterOfBinaryTreeInner(root);
        return this.longest; 
    } 
     
    
    public int diameterOfBinaryTreeInner(TreeNode root) { 
        
        if (root == null) { 
            return 0; 
        } 
          
        int diameterLeft = 0;
        int diameterRight = 0;  
        
        if (root.left != null) { 
             diameterLeft = diameterOfBinaryTreeInner(root.left) + 1;   
        } 
         
        if (root.right != null) { 
             diameterRight = diameterOfBinaryTreeInner(root.right) + 1;     
        } 
           
        
        if (diameterLeft+diameterRight > this.longest) { 
            this.longest = diameterLeft+diameterRight;     
        } 
          
        return Math.max(diameterLeft , diameterRight);
    
    }
}