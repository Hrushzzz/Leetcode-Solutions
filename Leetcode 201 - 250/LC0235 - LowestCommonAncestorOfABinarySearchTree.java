// Problem Link ::: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/description/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode temp = root;
        while (temp != null) {
            if (p.val < temp.val && q.val < temp.val) {   //LCA is on left
                temp = temp.left;
            } else if (p.val > temp.val && q.val > temp.val) {   //LCA is on right
                temp = temp.right;
            } else {   //1 elem is < temp.val && 1 elem is > temp.val
                return temp;
            }
        }
        return temp;
    }
}
