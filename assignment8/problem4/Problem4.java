import java.util.*;

public class Problem4<T>{
  
   private Node root;
   public Node rootNode;
   
   public Problem4(){
      this.root = null;
   }
   
   public Problem4(T data){
      this.root = new Node(data);
   }
   
   private class PostorderIterator implements Iterator{
   
      private Stack<Node> nodeStack;
      private Node currentNode;
      private boolean visitedLeftAndRightBranches;
   
      public PostorderIterator(){
         nodeStack = new Stack<>();
         currentNode = root;
      }
     
      public boolean hasNext(){
         return !nodeStack.isEmpty() || (currentNode != null);
      }
      
      public T next(){
         Node nextNode = null;
         
         while (currentNode != null){             
            nodeStack.push(currentNode);
            currentNode = currentNode.getLeftNode();
         }
         
         nextNode = nodeStack.pop(); 
         if (nodeStack.isEmpty()){}
               
         else if ((nodeStack.peek().getRightNode() != null) && (nodeStack.peek().getRightNode().getFlag())){
            currentNode = nodeStack.peek().getRightNode();
            currentNode.setFlag(false);
         }
         
         return nextNode.getData();
      } 
   }
      
   public void remove(){
      throw new UnsupportedOperationException();
   }
   
   public boolean isEmpty(){
      return root == null;
   }
   
   public void clear(){
      root = null;
   }

   public void postorderTraverse(){
      PostorderIterator postorder = new PostorderIterator();
      while (postorder.hasNext()){
         System.out.println(postorder.next());
         System.out.println();
      }  
   }
   
   public void setTree(T data, Problem4 leftTree, Problem4 rightTree){
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
   }

   private class Node{
   
      private T data;
      private Node left;
      private Node right;
      private boolean flag;
      
      private Node(){
         this(null);
      }
      
      private Node(T data){
         this.data = data;
         this.flag = true;
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
      
      private boolean getFlag(){
         return this.flag;
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
      
      private void setFlag(boolean flag){
         this.flag = flag;
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