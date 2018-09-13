
public class DoublyLinkedListTest {

	public static void main(String[] args) {
		
		DoublyLinkedList<String> myList = new DoublyLinkedList<String>();
	      
	    System.out.println("Is the list empty?");
	    System.out.println(myList.isEmpty());
	    System.out.println("");   
	      
	    System.out.println("Can we add?");
	    System.out.println(myList.addFirst("Hello"));
	    System.out.println(myList.addFirst("Clark"));
	    System.out.println(myList.addFirst("Lindsay"));
	    System.out.println(myList.addLast("RandomStuff"));
	    System.out.println(""); 
	     
        System.out.println("Is the list empty?");
	    System.out.println(myList.isEmpty());
	    System.out.println("");
	    
	    System.out.println("Does the list contain this?");
	    System.out.println(myList.searchRemove("Clark"));
	    System.out.println(myList.searchRemove("goat"));
	    System.out.println("");
	      
	    System.out.println("Removing:");
	    System.out.println(myList.removeLast());
	    System.out.println(myList.removeFirst());
	    System.out.println("");
	}

}
