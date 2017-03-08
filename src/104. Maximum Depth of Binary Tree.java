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
    public int maxDepth(TreeNode root) {
        return calcDepth(root, 0);
    }
    
    private int calcDepth(TreeNode root, int depth) {
        if (root == null) {
            return depth;
        }
        
        int dLeft = calcDepth(root.left, depth + 1);
        int dRight = calcDepth(root.right, depth + 1);
        return Math.max(dLeft, dRight);
    }
}