/**
*The WalletInterface interface may be implemented by an ADT for a 
*simulated wallet.
*
*@arthor Clark Lindsay
*@version 1.0
*@since 2018-02-12 
*/

public interface WalletInterface<Money>{

   /**
   The currentContent method returns the total value of
   the paper money stored inside the wallet. The returned 
   value is calculated according to current U.S. rates.
   
   @return double Current cash value of notes in wallet.
   */
   public double currentContent();
   
   /**
   The getFrequency method returns the number of bills of
   a specified type stored in the wallet.
   
   @param entry The specified bill type.
   @return int The number of the specified bills in the wallet. 
   */
   public int getFrequency(Money entry);
   
   /**
   The remove method removes a specified bill from the wallet.
   
   @param entry The specified bill type.
   @return boolean If the operation was successful.
   */
   public boolean remove(Money entry);
   
   /**
   The contains method searches the wallet for a specified type
   of bill and returns 'true' is the wallet contains it.
   
   @param entry The specified bill type.
   @return boolean If the operation was successful.
   */
   public boolean contains(Money entry);
   
   /**
   The isEmpty method determines if there are any bills stored
   in the wallet and returns 'true' is there are none.
   
   @return boolean If the wallet is devoid of bills.
   */
   public boolean isEmpty();
   
   /**
   The exchangeRate method determines the value of a specified bill
   given an exchange rate. 
   
   @param entry The specified bill type.
   @param rate The cash equivelence of 1 U.S. dollar.
   @return double The cash equivelence of the specified bill type.
   */
   public double exchangeRate(Money entry, double rate);
}