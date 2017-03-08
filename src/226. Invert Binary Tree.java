/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (isLeaf(root)) {
            return root;
        }

        invertLeaf(root);
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
    
    private boolean isLeaf(TreeNode node) {
        return node == null || (node.left == null && node.right == null);
    }
    
    private void invertLeaf(TreeNode node) {
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
    }
}