class Solution {
    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        
        if(root != null)
            findLeftSum(root);
        return sum;
    }
    public void findLeftSum(TreeNode node){

        if(node==null) return;
        if(node.left != null && node.left.left == null && node.left.right==null)
        {
            //if left child is leaf node
            sum+= node.left.val;
        }

        //go left
        findLeftSum(node.left);
        //go right
        findLeftSum(node.right);
    }
}
