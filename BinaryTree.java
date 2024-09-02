

public class BinaryTree {
    
    private TreeNode root;
    private class TreeNode{
        private int data;
        TreeNode left;
        TreeNode right;
        public TreeNode(int data) {
            this.data = data;
        }
    }

    public void CreateBinaryTree(){
        TreeNode first = new TreeNode(9);
        TreeNode sec = new TreeNode(2);
        TreeNode three = new TreeNode(4);
        TreeNode four = new TreeNode(3);

        root = first;
        root.left = sec;
        root.right = three;
        sec.left = four;
    }

    public void PreOrder(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.data+ " ");
        PreOrder(root.left);
        PreOrder(root.right);
    }
    public void InOrder(TreeNode root){
        if(root == null){
            return;
        }

        InOrder(root.left);
        System.out.print(root.data+ " ");
        InOrder(root.right);
    }

    public void PostOrder(TreeNode root){
        if(root == null){
            return;
        }

        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.data+ " ");
    }


    public static void main(String args[]){
        BinaryTree bt = new BinaryTree();
        bt.CreateBinaryTree();

        System.out.println("Pre-Order Traverse");
        bt.PreOrder(bt.root);
        System.out.println();
        System.out.println("In-Order Traverse");
        bt.InOrder(bt.root);
        System.out.println();
        System.out.println("Post-Order Traverse");
        bt.PostOrder(bt.root);
    }

}