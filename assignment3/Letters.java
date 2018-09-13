public class Letters<T>{

   private int size;
   private T[] lettersArray;
   private final int CAPACITY = 52;
	
   @SuppressWarnings("unchecked")
   public Letters(){
      size = 0;
      lettersArray = (T[])new Object[CAPACITY];
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
         lettersArray[size] = item;
         size++;
         return true;
      }
      else
         return false;
   }
	
   public T remove(){
      T removed;
      removed = lettersArray[size - 1];
      lettersArray[size - 1] = null;
      size--;
      return removed;
   }
   
   public boolean contains(T item){
      boolean isTrue = false;
   	
      for (int i = 0; i < size; i++){
         if (lettersArray[i] == item) {
            isTrue = true;
         }
      }
   	
      if (isTrue == true)
         return true;
      else 
         return false;
   }	
      
   public int getCurrentSize(){
      return size;
   }  
   	
   public int getFrequency(T item){
      int count = 0;
   	
      for (int i = 0; i < size; i++){
         if (lettersArray[i] == item){
            count++;
         }
      }
   	
      return count;
   }
}
