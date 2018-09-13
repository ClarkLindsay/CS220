public interface QueueInterface<T>{
   
   public T getFront();
   
   public void enqueue(T entry);
   
   public T dequeue();
   
   public boolean isEmpty();
   
   public void clear();
}