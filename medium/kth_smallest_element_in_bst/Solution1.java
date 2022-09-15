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
    int k; 
    int result;
    public void inorderTraversal(TreeNode root) {  
        if (root != null) {   
            inorderTraversal(root.left); 
            this.k--; 
            if (this.k == 0) { 
                this.result = root.val;
            }
            inorderTraversal(root.right); 
        }
    }  
    
    public int kthSmallest(TreeNode root, int k) {  
        this.k = k; 
        inorderTraversal(root);   
        return this.result; 
        
    }
}