/**
*The RingInterface interface may be implemented by an ADT for a ring.
*
*@arthor Clark Lindsay
*@version 1.0
*@since 2018-02-12 
*/

public interface RingInterface<Item>{

   /**
   The advance method advances the reference to the next item in the ring.
   */
   public void advance();
   
   /**
   The currentItem method returns the current item.
   
   @return Item The current item in the ring.
   */
   public Item currentItem();
   
   /**
   The add method adds an item to the start of the ring.
   
   @param entry The item to add.
   @return boolean If the operation was successful.
   */
   public boolean add(Item entry);
   
   /**
   The remove method removes an item from end of the ring.
   
   @param entry The item to remove.
   @return boolean If the operation was successful.
   */
   public boolean remove(Item entry);
   
}