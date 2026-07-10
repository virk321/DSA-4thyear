package day5;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class binaryTreeCameras {

    static int cameras = 0;

    public static int dfs(TreeNode root) {

        if (root == null)
            return 2; // Null node is already covered

        int left = dfs(root.left);
        int right = dfs(root.right);

        // If any child needs camera
        if (left == 0 || right == 0) {
            cameras++;
            return 1;
        }

        // If any child has camera
        if (left == 1 || right == 1) {
            return 2;
        }

        // Both children are covered but no camera
        return 0;
    }

    public static int minCameraCover(TreeNode root) {

        if (dfs(root) == 0)
            cameras++;

        return cameras;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(0);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(0);

        System.out.println(minCameraCover(root));
    }
}