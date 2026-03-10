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
// class Solution {
//     public boolean isValidBST(TreeNode root) {
//         return check(root, Long.MIN_VALUE, Long.MAX_VALUE);
//     }

//     public boolean check(TreeNode root, long min, long max) {
//         if (root == null)
//             return true;

//         if (root.val <= min || root.val >= max)
//             return false;

//         return check(root.left, min, root.val) &&
//                 check(root.right, root.val, max);

//     }
// }

class Solution {
    TreeNode prev = null;

    public boolean isValidBST(TreeNode root) {
        if (root != null) {

            if (!isValidBST(root.left))
                return false;
            if (prev != null && prev.val >= root.val)
                return false;

            prev = root;

            return isValidBST(root.right);
        }
        return true;
    }
}