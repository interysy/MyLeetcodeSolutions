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
      
   
     
    public TreeNode sortedArrayToBST(int[] nums) {   
         
        if (nums.length  == 0) { 
            return null; 
        } 
        
        int middlePoint = nums.length / 2;  
        int middleElement = nums[middlePoint]; 
        TreeNode newNode = new TreeNode(middleElement); 
        
        newNode.left = sortedArrayToBST(Arrays.copyOfRange(nums,0, middlePoint)); 
        newNode.right = sortedArrayToBST(Arrays.copyOfRange(nums,middlePoint+1, nums.length));  
         
        return newNode; 
            
             
        }
         
    }
    