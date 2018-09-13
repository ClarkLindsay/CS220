public class Bag<T> implements BagInterface<T>{

	private int size;
	private T[] items;
	private final int CAPACITY = 20;
	
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
	
	@Override
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
	
	@Override
	public boolean remove(T item){
		if (this.isEmpty() == false){
			for (int i = 0; i < size; i++){
				if (items[i].getClass().isInstance(item)){
					items[i] = null;	
					size--;
					i = size;
				}
			}
			return true;
		}
		else 
			return false;
	}
	
	public void clear(){
		while (this.isEmpty() == false){
				this.remove();
		}
	}
	
	@Override
	public int getFrequencyOf(T item){
		int count = 0;
		
		for (int i = 0; i < size; i++){
			if (items[i].getClass().isInstance(item)){
				count++;
			}
		}
		
		return count;
	}
	
	@Override
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
	
	public T[] toArray(){
		@SuppressWarnings("unchecked")
		T[] result = (T[]) new Object[20];
		for (int i = 0; i < size; i++){
			result[i] = items[i];
		}
		
		return result;
	}
	
}
