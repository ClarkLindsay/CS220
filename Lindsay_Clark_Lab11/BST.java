public class BST<T extends Comparable<? super T>>{

   private Node root;

   public BST(){
      this.root = null;
   }

   public BST(T data){
      this.root = new Node(data);
   }
   
   public boolean isEmpty(){
      return root == null;
   }
   
   public T add(T entry){
      T result = null;
      
      if (isEmpty()){
         root = (new Node (entry));
         result = root.getData();
      }
      else 
         result = addEntry(root, entry);
         
      return result;
   }
   
   private T addEntry(Node rootNode, T newEntry){
      assert rootNode != null;
      T result = null;
      int comparison = newEntry.compareTo(rootNode.getData());
      
      if (comparison == 0){
         result = rootNode.getData();
         rootNode.setData(newEntry);
      }
      
      else if (comparison < 0){
         if (rootNode.getLeftNode() != null)
            result = addEntry(rootNode.getLeftNode(), newEntry);
         else {
            rootNode.setLeftNode(new Node (newEntry));
            result = newEntry;
         }
      }
      
      else{
         assert comparison > 0;
         
         if (rootNode.getRightNode() != null)
            result = addEntry(rootNode.getRightNode(), newEntry);
         else {
            rootNode.setRightNode(new Node (newEntry));
            result = newEntry;
         }
      }   
      return result;     
   } 
    
   public T getEntry(T entry){
      return findEntry(root, entry);
   } 
   
   private T findEntry(Node rootNode, T entry){
      T result = null;
      
      if (rootNode != null){
         T rootEntry = rootNode.getData();
         
         if (entry.equals(rootEntry))
            result = rootEntry;
         else if (entry.compareTo(rootEntry) < 0)
            result = findEntry(rootNode.getLeftNode(), entry);
         else
            result = findEntry(rootNode.getRightNode(), entry);
      }
      return result;
   } 
   
   public boolean contains(T entry){
      return containsEntry(root, entry);
   }
   
   private boolean containsEntry(Node root, T entry){
      boolean found = false;
      
      if (isEmpty())
         return false;
      
      else if (entry.equals(root.getData())){
         found = true;
      }
            
      else if (entry.compareTo(root.getData()) < 0){
         if (root.getLeftNode() != null)
            return containsEntry(root.getLeftNode(), entry);
      }
         
      else {
         if (root.getRightNode() != null)
            return containsEntry(root.getRightNode(), entry); 
      }
         
      return found;       
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
   
   public T remove(T entry){
      Node oldEntry = new Node(null);
      Node newRoot = removeEntry(root, entry, oldEntry);
      
      root = newRoot;
      
      return oldEntry.getData();
   }
   
   private Node removeEntry(Node rootNode, T entry, Node oldEntry){
      if (rootNode != null){
         T rootData = rootNode.getData();
         int comparison = entry.compareTo(rootData);
         
         if (comparison == 0){
            oldEntry.setData(rootData);
            rootNode = removeFromRoot(rootNode);
         }
         
         else if (comparison < 0){
            Node leftChild = rootNode.getLeftNode();
            rootNode.setLeftNode(removeEntry(leftChild, entry, oldEntry));
         }
         
         else{
            Node rightChild = rootNode.getRightNode();
            rootNode.setRightNode(removeEntry(rightChild, entry, oldEntry));
         }
      }
      return rootNode;
   }
   
   private Node removeFromRoot(Node rootNode){
      if ((rootNode.getLeftNode() != null) && (rootNode.getRightNode() != null)){
         Node leftSubTreeRoot = rootNode.getLeftNode();
         Node largestNode = findLargest(leftSubTreeRoot);
         
         rootNode.setData(largestNode.getData());
         
         rootNode.setLeftNode(removeLargest(leftSubTreeRoot));
      }
      
      else if (rootNode.getRightNode() != null)
         rootNode = rootNode.getRightNode();
         
      else
         rootNode = rootNode.getLeftNode();
         
      return rootNode;  
   }
   
   private Node findLargest(Node rootNode){
      if (rootNode.getRightNode() != null)
         rootNode = findLargest(rootNode.getRightNode());
         
      return rootNode;     
   }
   
   private Node removeLargest(Node rootNode){
      if (rootNode.getRightNode() != null){
         Node rightChild = rootNode.getRightNode();
         Node root = removeLargest(rightChild);
         rootNode.setRightNode(root);
      }
       
      else 
         rootNode = rootNode.getLeftNode();
         
      return rootNode;
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
   }
}