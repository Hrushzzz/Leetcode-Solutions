// Problem Link ::: https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/

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
        int N = nums.length;
        return createBBST(nums , 0 , N-1);
    }
    public TreeNode createBBST(int[] nums , int start , int end) {
        if (start > end) {  //base case
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = createBBST(nums , start , mid-1);  //creating LST
        root.right = createBBST(nums , mid+1 , end);  //creating RST
        return root;
    }
}

// TC : O(N) , SC : O(1)
