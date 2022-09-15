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
class Solution { 
    boolean flag = false;  
    public int kthSmallest(TreeNode root , int k) {   
        if (root != null) {     
            
            k = kthSmallest(root.left , k); 
            
            if (this.flag) { 
                return k; 
            } 
            
            k--;   
            
            if (k == 0) {     
                this.flag = true;
                return root.val;
            } 
            
            k = kthSmallest(root.right , k);   
            
            if (flag) { 
                return k;
            }
        } 
        return k; 
        
    }  
    
}