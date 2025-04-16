// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// class Solution {
//     int dia =0;
//     public int diameterOfBinaryTree(TreeNode root) {
//          if (root == null) return 0;

//         // Calculate the height of the left and right subtrees
//         int leftHeight = diameterOfBinaryTree(root.left);
//         int rightHeight = diameterOfBinaryTree(root.right);

//         // Update the static diameter variable with the maximum diameter found so far
//         dia = Math.max(dia, leftHeight + rightHeight);

//         // Return the height of the current subtree
//         return 1 + Math.max(leftHeight, rightHeight);
//     }
// }
class Solution {
    private int dia = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return dia;
    }

    private int height(TreeNode node) {
        if (node == null) return 0;

        int left = height(node.left);
        int right = height(node.right);

        dia = Math.max(dia, left + right); // update diameter

        return 1 + Math.max(left, right); // return height
    }
}

