// Problem Link ::: https://leetcode.com/problems/diameter-of-binary-tree/description/

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
    int diameter;
    public int diameterOfBinaryTree(TreeNode root) {  //main function
        diameter = 0;
        diameterOfTree(root);
        return diameter - 1;
    }
    public int diameterOfTree(TreeNode root) {
        TreeNode temp = root;
        if (temp == null) {
            return 0;
        }
        int l = diameterOfTree(temp.left);
        int r = diameterOfTree(temp.right);
        if (diameter < l+r+1) {  //checking if current diameter is greater than overall diameter
            diameter =  l + r + 1; 
        }
        return Math.max(l,r) + 1;  //returns length of tree
    }
}
