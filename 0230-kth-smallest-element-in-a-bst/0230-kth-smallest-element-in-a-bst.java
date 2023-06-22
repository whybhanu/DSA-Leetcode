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
    public int kthSmallest(TreeNode root, int k) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> finalList = new ArrayList<>();
        if(root == null) return 0;
        q.add(root);
        while(!q.isEmpty()){
            int level = q.size();
            for(int i = 0; i < level; i++){
                TreeNode curr = q.poll();
                finalList.add(curr.val);
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
        }
        Collections.sort(finalList);
        // return 2;
        return finalList.get(k - 1);
    }
}