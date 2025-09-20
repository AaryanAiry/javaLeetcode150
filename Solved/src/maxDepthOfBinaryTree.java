class maxDepthOfBinaryTree {
    int maxDepth = 0;
    
    public int maxDepth(TreeNode root) {
        findDepth(root,1);
        return maxDepth;
    }
    public void findDepth(TreeNode node, int depth){
        if(node == null) return;

        if(node.left == null && node.right == null){
            //leaf node
            if(depth>maxDepth)
                maxDepth = depth;
        }
    
        //go left
        findDepth(node.left,depth+1);
        
        //go right 
        findDepth(node.right,depth+1);
    }
}
