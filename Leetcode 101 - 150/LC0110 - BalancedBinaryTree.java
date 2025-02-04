// Problem Link ::: https://leetcode.com/problems/balanced-binary-tree/description/

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
    boolean isHeightBalanced = true;
    public boolean isBalanced(TreeNode root) {
        isHeightBalanced = true;
        myTree(root);
        if (isHeightBalanced == false) {
            return false;
        }
        return true;
    }
    public int myTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = myTree(root.left);
        int rightHeight = myTree(root.right);
        if (Math.abs(leftHeight - rightHeight) > 1) {
            isHeightBalanced = false;
        }
        return Math.max(leftHeight , rightHeight) + 1;
    }
}

//TC : O(N) , SC : O(1)
