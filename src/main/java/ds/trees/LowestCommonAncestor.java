package ds.trees;

/**
 * Created by skupunarapu on 9/19/2015.
 */
public class LowestCommonAncestor {
    static class TreeNode{
        private int data;
        private TreeNode leftNode;
        private TreeNode rightNode;

        public TreeNode(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public TreeNode getLeftNode() {
            return leftNode;
        }

        public void setLeftNode(TreeNode leftNode) {
            this.leftNode = leftNode;
        }

        public TreeNode getRightNode() {
            return rightNode;
        }

        public void setRightNode(TreeNode rightNode) {
            this.rightNode = rightNode;
        }
    }


    public static TreeNode lca(TreeNode root, TreeNode x, TreeNode y){

        if(root == null)
            return null;

        if(root.getData() == x.getData() || root.getData() == y.getData())
            return root;

        TreeNode left = lca(root.getLeftNode(), x, y);
        TreeNode right = lca(root.getRightNode(), x, y);

        if(left != null && right != null)
            return root;

        return left !=null ? left : right;
    }

    public static void main(String[] args) {
        TreeNode tn1 = new TreeNode(2);

        TreeNode tn2 = new TreeNode(7);
        TreeNode tn3 = new TreeNode(5);
        tn1.setLeftNode(tn2);
        tn1.setRightNode(tn3);

        TreeNode tn4 = new TreeNode(2);
        TreeNode tn5 = new TreeNode(6);
        tn2.setLeftNode(tn4);
        tn2.setRightNode(tn5);

        TreeNode tn6 = new TreeNode(9);
        tn3.setRightNode(tn6);

        TreeNode tn7 = new TreeNode(5);
        TreeNode tn8 = new TreeNode(11);
        tn5.setLeftNode(tn7);
        tn5.setRightNode(tn8);

        TreeNode tn9 = new TreeNode(4);
        tn6.setLeftNode(tn9);

        int data = lca(tn1, tn6, tn9).getData();
        System.out.println(data);

    }
}
