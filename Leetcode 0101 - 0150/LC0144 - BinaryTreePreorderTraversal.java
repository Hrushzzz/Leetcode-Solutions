Problem Link ::: https://leetcode.com/problems/binary-tree-preorder-traversal/description/

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
    
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> finalArr = new ArrayList<>();
        preOrder(finalArr , root);
        return finalArr;
    }
    public void preOrder(List finalArr , TreeNode node) {
        if (node == null) {
            return;
        }
        finalArr.add(node.val);
        preOrder(finalArr , node.left);
        preOrder(finalArr , node.right);
    }
}

// TC : O(N) , SC : O(height of tree / max stack size)
