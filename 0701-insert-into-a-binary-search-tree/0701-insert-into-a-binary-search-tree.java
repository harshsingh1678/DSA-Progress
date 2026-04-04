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
// Striver sol
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }

        TreeNode cur = root; // TC - O(log n)

        while (true) {
            if (val <= cur.val) {
                if (cur.left != null)
                    cur = cur.left;
                else {
                    cur.left = new TreeNode(val);
                    break;
                }
            } else {
                if (cur.right != null)
                    cur = cur.right;
                else {
                    cur.right = new TreeNode(val);
                    break;
                }
            }
        }
        return root;
    }
}
