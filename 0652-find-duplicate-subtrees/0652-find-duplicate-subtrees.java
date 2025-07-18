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
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        Map<String, Integer> map = new HashMap<>();
        List<TreeNode> result = new ArrayList<>();
        serialize(root, map, result);
        return result;
    }

    private String serialize(TreeNode root, Map<String, Integer> map, List<TreeNode> result) {
        if (root == null) {
            return "#";
        }

        String serial = root.val + "," + serialize(root.left, map, result) + "," + serialize(root.right, map, result);

        map.put(serial, map.getOrDefault(serial, 0) + 1);

        if (map.get(serial) == 2) {
            result.add(root);
        }

        return serial;
    }
}