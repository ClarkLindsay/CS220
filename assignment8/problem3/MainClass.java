public class MainClass{

   public static void main(String[] args){
      Problem3<String> aTree = new Problem3<String>("A");
      Problem3<String> cTree = new Problem3<String>("C");
      Problem3<String> eTree = new Problem3<String>("E");
      Problem3<String> gTree = new Problem3<String>("G");
      
      Problem3<String> tree1 = new Problem3<String>();
      tree1.setTree("A", gTree, eTree);
      System.out.println(tree1.count("E"));
      System.out.println();
      
      Problem3<String> tree2 = new Problem3<String>();
      tree2.setTree("A", eTree, eTree);
      System.out.println(tree2.count("E"));
      System.out.println();
      
      Problem3<String> tree3 = new Problem3<String>();
      tree3.setTree("E", tree1, tree2);
      System.out.println(tree3.count("E"));
      System.out.println();
   }
}