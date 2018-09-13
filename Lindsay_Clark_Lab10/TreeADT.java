public class TreeADT<T>{

   private Node root;
   
   public TreeADT(){
      this.root = null;
   }
   
   public TreeADT(T data){
      this.root = new Node(data);
   }
   
   public boolean isEmpty(){
      return root == null;
   }
   
   public void clear(){
      root = null;
   }
   
   public void inorderTraverse(){
      inorderTraverse(root);
   }
   
   public void inorderTraverse(Node node){
      if ((node != null) && !isEmpty()){
         inorderTraverse(node.getLeftNode());
         System.out.println(node.getData());
         inorderTraverse(node.getRightNode());
      }
   }
   
   public void preorderTraverse(){
      preorderTraverse(root);
   }
   
   public void preorderTraverse(Node node){
      if (node != null){
         System.out.println(node.getData());
         preorderTraverse(node.getLeftNode());
         preorderTraverse(node.getRightNode());
      }
   }
   
   public void postorderTraverse(){
      postorderTraverse(root);
   }
   
   public void postorderTraverse(Node node){
      if (node != null){
         postorderTraverse(node.getLeftNode());
         postorderTraverse(node.getRightNode());
         System.out.println(node.getData());
      }
   }
   
   public void setTree(T data, TreeADT leftTree, TreeADT rightTree){
      root = new Node(data);
      
      if ((leftTree != null) && !leftTree.isEmpty()){
         root.setLeftNode(leftTree.root);
      }
      
      if ((rightTree != null) && !rightTree.isEmpty()){
         if (rightTree != leftTree)
            root.setRightNode(rightTree.root);
         
         else
            root.setRightNode(rightTree.root.copy());
      }
      
      if ((leftTree != null) && (leftTree != this))
         leftTree.clear();
         
      if ((rightTree != null) && (rightTree != this))
         rightTree.clear();
   }

   private class Node{
   
      private T data;
      private Node left;
      private Node right;
      
      private Node(){
         this(null);
      }
      
      private Node(T data){
         this.data = data;
      }
      
      private T getData(){
         return this.data;
      }
      
      private Node getLeftNode(){
         return this.left;
      }
      
      private Node getRightNode(){
         return this.right;
      }
      
      private void setData(T data){
         this.data = data;
      }
      
      private void setLeftNode(Node left){
         this.left = left;
      }
      
      private void setRightNode(Node right){
         this.right = right;
      }  
      
      private Node copy(){
         Node newRoot = new Node(data);
         
         if (left != null)
            newRoot.left = (Node) left.copy();
            
         if (right != null)
            newRoot.right = (Node) right.copy();
            
         return newRoot;
      }   
   }
}