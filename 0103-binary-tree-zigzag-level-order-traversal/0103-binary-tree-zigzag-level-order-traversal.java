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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        dfs(root, 0, list);
        return list;
    }

    private void dfs(TreeNode root, int depth, List<List<Integer>> list) {
        if (root == null)
            return;

        if (list.size() == depth)
            list.add(new ArrayList<>());

        if (depth % 2 == 0) {
            list.get(depth).add(root.val);
        } else {
            list.get(depth).add(0, root.val);
        }
        
        dfs(root.left, depth + 1, list);
        dfs(root.right, depth + 1, list);
    }
}