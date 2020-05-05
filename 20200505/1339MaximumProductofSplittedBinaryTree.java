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
    long res = 0, total = 0, sub;
    // record the updating res, total sum of the tree, and the sum of each sub tree
    public int maxProduct(TreeNode root) {
        total = s(root); // calculate the total
        s(root);//update the res
        return (int)(res % (int)(1e9 + 7));
    }

    private long s(TreeNode root) {
        if (root == null) return 0;
        sub = root.val + s(root.left) + s(root.right);
        // for the first pass, res is not updated correctly since the total is not accurate
        res = Math.max(res, sub * (total - sub));
        return sub;
    }
}