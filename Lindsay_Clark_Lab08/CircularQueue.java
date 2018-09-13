public class CircularQueue<T> implements QueueInterface<T>{
    
   private T[] queue;
   private int frontIndex;
   private int backIndex;
    
   public CircularQueue(){
      this(50);
   }
   
   public CircularQueue(int capacity){
      @SuppressWarnings("unchecked")
         T[] tempQueue = (T[]) new Object[capacity + 1];
      queue = tempQueue;
      frontIndex = 0;
      backIndex = capacity;
   }
   
   private void ensureCapacity(){
      if (frontIndex == ((backIndex + 2) % queue.length)){
         
         T[] oldQueue = queue;
         int oldSize = oldQueue.length;
         
         @SuppressWarnings("unchecked")
            T[] tempQueue = (T[]) new Object[2 * oldSize];
         queue = tempQueue;
            
         for (int i = 0; i < oldSize - 1; i++){
            queue[i] = oldQueue[frontIndex];
            frontIndex = (frontIndex + 1) % oldSize;
         }
            
         frontIndex = 0;
         backIndex = oldSize - 2;
      }   
   }
   
   public void enqueue(T entry){  
      ensureCapacity();
      
      backIndex = (backIndex + 1) % queue.length;
      queue[backIndex] = entry;
   }
   
   public T dequeue(){
      T front = null;
      
      if (!isEmpty()){
         front = queue[frontIndex];
         queue[frontIndex] = null;
         frontIndex = (frontIndex + 1) % queue.length;
      }
      
      return front;
   }
   
   public T getFront(){
      if (isEmpty())
         return null;
      else
         return queue[frontIndex];
   }
   
   public boolean isEmpty(){
      return frontIndex == ((backIndex + 1) % queue.length);
   }
   
   public void clear(){
      while (!isEmpty())
         dequeue();
   }
}