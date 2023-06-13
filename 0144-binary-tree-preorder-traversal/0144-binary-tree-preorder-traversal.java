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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        return helper(root, list);
    }
    List<Integer> helper(TreeNode root, ArrayList<Integer> list){
        if(root == null) return list;
        list.add(root.val);
        helper(root.left, list);
        helper(root.right, list);
        return list;
    }

}