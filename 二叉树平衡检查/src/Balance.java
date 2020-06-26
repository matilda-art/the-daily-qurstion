/**
 * @program: 二叉树平衡检查
 * @description
 * 实现一个函数，检查二叉树是否平衡，平衡的定义如下：
 * 对于树中的任意一个结点，其两颗子树的高度差不超过1。
 * 给定指向树根结点的指针TreeNode* root，请返回一个bool，代表这棵树是否平衡。
 * @author: matilda
 * @create: 2020-06-26 20:45
 **/
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}

public class Balance {
    public boolean isBalance(TreeNode root) {
        if(root == null){
            return true;
        }
        if (Math.abs(deepth(root.left) - deepth(root.right)) > 1){
            return false;
        }else {
            return isBalance(root.left) & isBalance(root.right);
        }
    }

    public int deepth(TreeNode root){
        if (root == null){
            return 0;
        }
        return Math.max(deepth(root.left),deepth(root.right)+1);
    }
}
