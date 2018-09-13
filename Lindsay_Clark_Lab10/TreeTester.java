public class TreeTester{

   public static void main(String[] args){
      TreeADT<String> aTree = new TreeADT<String>("A");
      TreeADT<String> cTree = new TreeADT<String>("C");
      TreeADT<String> eTree = new TreeADT<String>("E");
      TreeADT<String> gTree = new TreeADT<String>("G");
      
      TreeADT<String> t2 = new TreeADT<String>();
      t2.setTree("B", aTree, cTree);  
      
      t2.inorderTraverse();
      System.out.println();
      t2.preorderTraverse();
      System.out.println();
      t2.postorderTraverse();
      System.out.println();
      
      TreeADT<String> t5 = new TreeADT<String>();
      t5.setTree("F", eTree, gTree);
      
      t5.inorderTraverse();
      System.out.println();
      t5.preorderTraverse();
      System.out.println();
      t5.postorderTraverse();
      System.out.println();
      
      TreeADT<String> t7 = new TreeADT<String>();
      t7.setTree("D", t2, t5);
      
      t7.inorderTraverse();
      System.out.println();
      t7.preorderTraverse();
      System.out.println();
      t7.postorderTraverse();
      System.out.println();
   }
}