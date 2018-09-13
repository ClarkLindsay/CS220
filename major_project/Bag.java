package major_project;

//Array bag used for the backpack and the languages
public class Bag<T>{

   private int size;
   private T[] items;
   private final int CAPACITY = 100;
	
   @SuppressWarnings("unchecked")
   public Bag(){
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
	
   public T remove(){
      T removed;
      removed = items[size - 1];
      items[size - 1] = null;
      size--;
      return removed;
   }

   public T remove(T item){
   
      T removed = null;
   
      if (this.isEmpty() == false){
         for (int i = 0; i < size; i++){
            if (items[i].getClass().isInstance(item)){
               removed = items[i];
               items[i] = null;	
               size--;
               i = size;
            }
         }
      }
      return removed;
   }
	
   public void clear(){
      while (this.isEmpty() == false){
         this.remove();
      }
   }

   public int getFrequencyOf(T item){
      int count = 0;
   	
      for (int i = 0; i < size; i++){
         if (items[i].getClass().isInstance(item)){
            count++;
         }
      }
   	
      return count;
   }

   public boolean contains(T item){
      boolean isTrue = false;
   	
      for (int i = 0; i < size; i++){
         if (items[i].getClass().isInstance(item)) {
            isTrue = true;
         }
      }
   	
      if (isTrue == true)
         return true;
      else 
         return false;
   }
   
   public boolean containsString(T item){
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
	
   public T[] toArray(){
      @SuppressWarnings("unchecked")
         T[] result = (T[]) new Object[size];
      for (int i = 0; i < size; i++){
         result[i] = items[i];
      }
   	
      return result;
   }
	
}
