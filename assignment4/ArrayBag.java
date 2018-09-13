public class ArrayBag<T>{

   private int size;
   private T[] items;
   private final int CAPACITY = 20;
	
   @SuppressWarnings("unchecked")
   public ArrayBag(){
      size = 0;
      items = (T[])new Object[CAPACITY];
   }
	
   public int getCurrentSize(){
      return size;
   }
	
   public boolean isFull(){
      if (size == CAPACITY)
         return true;
      else
         return false;
   }
	
   public boolean isEmpty(){
      if (size == 0)
         return true;
      else
         return false;
   }
	
   public boolean add(T item){
      if (this.isFull() == false){
         items[size] = item;
         size++;
         return true;
      }
      else
         return false;
   }
	
   public void removeEvery(T item){
      for (int i = 0; i < size && size >= 0; i++){
         if (items[i].equals(item)){
            size--;
            items[i] = items[size];
            items[size] = null;	
         }
      }
   }
		
   public boolean contains(T item){
      boolean isTrue = false;
   	
      for (int i = 0; i < size; i++){
         if (items[i].equals(item)) {
            isTrue = true;
         }
      }
   	
      if (isTrue == true)
         return true;
      else 
         return false;
   }
}