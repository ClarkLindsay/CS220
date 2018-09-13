public class QueueInterface<T>{

   private Node firstNode;
   private Node lastNode;
   
   public QueueInterface(){
      firstNode = null;
      lastNode = null;
   } 
   
   public void enqueue(T newEntry){
      Node newNode = new Node(newEntry, null);
      
      if (isEmpty())
         firstNode = newNode;
      else
         lastNode.setNextNode(newNode);
         
      lastNode = newNode;
   }
   
   public T dequeue(){
      
      T front = null;
      
      if (!isEmpty()){
         front = firstNode.getData();
         firstNode = firstNode.getNextNode();
         
         if (firstNode == null)
            lastNode = null;
      }
      
      return front;
   }
   
   public T getFront(){
      
      T front = null;
      
      if (!isEmpty())
         front = firstNode.getData();
      
      return front;
   }
   
   public boolean isEmpty(){
      return (firstNode == null) && (lastNode == null);
   }
   
   public void clear(){
      firstNode = null;
      lastNode = null;
   }

   public void splice (QueueInterface<T> anotherQueue){
      while (anotherQueue.isEmpty() == false){
         enqueue(anotherQueue.dequeue());
      }     
   }
   
   private class Node{
      
      private T data;
      private Node next;
      
      private Node(T data, Node nextNode){
      
         this.data = data;
         this.next = nextNode;
      }
      
      private void setData(T data){
         this.data = data;
      }
      
      private void setNextNode(Node next){
         this.next = next;
      }
      
      private T getData(){
         return this.data;
      }
   
      private Node getNextNode(){
         return this.next;
      }
   }
}