public class PriorityQueue<T extends Comparable<? super T>>{
    
   private T[] queue;
   private int frontIndex;
   private int backIndex;
   private static final int DEFAULT_INITIAL_CAPACITY = 50;
   private int size;
    
   public PriorityQueue(){
      this(DEFAULT_INITIAL_CAPACITY);
   }
   
   public PriorityQueue(int initialCapacity){
      @SuppressWarnings("unchecked")
         T[] tempQueue = (T[]) new Comparable[initialCapacity + 1];
      queue = tempQueue;
      frontIndex = 0;
      backIndex = initialCapacity;
   }
   
   public void ensureCapacity(){
      if (frontIndex == ((backIndex + 2) % queue.length)){
         
         T[] oldQueue = queue;
         int oldSize = oldQueue.length;
         
         @SuppressWarnings("unchecked")
            T[] tempQueue = (T[]) new Comparable[2 * oldSize];
         queue = tempQueue;
            
         for (int i = 0; i < oldSize - 1; i++){
            queue[i] = oldQueue[frontIndex];
            frontIndex = (frontIndex + 1) % oldSize;
         }
            
         frontIndex = 0;
         backIndex = oldSize - 2;
      }   
   }
   
   public void enqueue(T newEntry){  
      ensureCapacity();
      
      int index = 0;
      
      for (int i = 0; i < size; i++){
         if ((queue[i].compareTo(newEntry)) < 0){
            index = i;
            break;
         }
      }
      
      for (int i = size; i >= 0; i--){
         if (i >= index){
            queue[i + 1] = queue[i]; 
         }
      }
      
      backIndex = (backIndex + 1) % queue.length;
      queue[index] = newEntry;
      size++;
   }
   
   public T dequeue(){
      T front = null;
      
      if (!isEmpty()){
         front = queue[frontIndex];
         queue[frontIndex] = null;
         frontIndex = (frontIndex + 1) % queue.length;
         size--;
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