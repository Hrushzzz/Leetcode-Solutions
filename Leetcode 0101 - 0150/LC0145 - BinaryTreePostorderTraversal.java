Problem Link ::: https://leetcode.com/problems/binary-tree-postorder-traversal/description/

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
    ArrayList<Integer> finalArr = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        postOrder(root);
        return finalArr;
    }
    public void postOrder (TreeNode root) {
        if (root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        finalArr.add(root.val);
    }
}

// TC : O(N) , SC : O(height of tree / max stack size)
