Problem Link ::: https://leetcode.com/problems/binary-tree-level-order-traversal/description/

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> finalArr = new ArrayList<List<Integer>>();
        Queue<TreeNode> myQueue = new LinkedList<>();
        if (root == null) {
            return finalArr;
        }
        myQueue.add(root);
        while (myQueue.size() > 0) {
            ArrayList<Integer> arr = new ArrayList<>();
            int N = myQueue.size();
            for (int i = 1 ; i <= N ; i++) {
                TreeNode temp = myQueue.poll();
                arr.add(temp.val); 
                if (temp.left != null) {
                    myQueue.add(temp.left);
                }
                if (temp.right != null) {
                    myQueue.add(temp.right);
                }
            }
            finalArr.add(arr);
        }
        return finalArr;
    }
}

// TC : O(no.of nodes) , SC : O(N)
