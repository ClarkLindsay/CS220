import java.util.*;

public class Problem3<T>{
   //These two parameters have been added for the problem 
   public int count = 0;
   public T entry;
  
   private Node root;
   public Node rootNode;
   
   public Problem3(){
      this.root = null;
   }
   
   public Problem3(T data){
      this.root = new Node(data);
   }
   
   //This class has been modified
   private class InorderIterator implements Iterator{
   
      private Stack<Node> nodeStack;
      private Node currentNode;
   
      public InorderIterator(){
         nodeStack = new Stack<>();
         currentNode = root;
      }
     
      public boolean hasNext(){
         return !nodeStack.isEmpty() || (currentNode != null);
      }
      
      //This method has been modified
      public T next(){
         Node nextNode = null;
         
         while (currentNode != null){
            //This is where the counting is done
            if (currentNode.getData().equals(entry))
               count++;
               
            nodeStack.push(currentNode);
            currentNode = currentNode.getLeftNode();
         }
         
         if (!nodeStack.isEmpty()){
            nextNode = nodeStack.pop();
            assert nextNode != null;
            
            currentNode = nextNode.getRightNode();
         }
         else throw new NoSuchElementException();
         
         return nextNode.getData();
      }
      
      public void remove(){
         throw new UnsupportedOperationException();
      }
   }
   
   public boolean isEmpty(){
      return root == null;
   }
   
   public void clear(){
      root = null;
   }
   
   //This is the method that the problem wanted
   public int count(T anObject){
      this.entry = anObject;
      inorderTraverse();
      return this.count;
   }
   
   //This method has been modified
   public void inorderTraverse(){
      InorderIterator inorder = new InorderIterator();
      while (inorder.hasNext()){
         inorder.next();
      }  
   }
   
   public void setTree(T data, Problem3 leftTree, Problem3 rightTree){
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