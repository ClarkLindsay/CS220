public class MainClass{

   public static void main(String[] args){
      Problem4<String> aTree = new Problem4<String>("A");
      Problem4<String> bTree = new Problem4<String>("B");
      Problem4<String> cTree = new Problem4<String>("C");
      Problem4<String> dTree = new Problem4<String>("D");
      Problem4<String> eTree = new Problem4<String>("E");
      Problem4<String> fTree = new Problem4<String>("F");
      Problem4<String> gTree = new Problem4<String>("G");
      
      Problem4<String> tree1 = new Problem4<String>();
      tree1.setTree("C", aTree, bTree);
      System.out.println();
      
      Problem4<String> tree2 = new Problem4<String>();
      tree2.setTree("F", dTree, eTree);
      System.out.println();
      
      Problem4<String> tree3 = new Problem4<String>();
      tree3.setTree("G", tree1, tree2);
      tree3.postorderTraverse();
      System.out.println();
   }
}