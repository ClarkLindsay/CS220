import java.io.*;
import java.util.*;
public class MainClass{

   public static void main(String[] args) throws Exception{
      int[] treeData = readFile("SmallNumbers.txt");
      
      BST tree = new BST();
      
      System.out.println("isEmpty() " + tree.isEmpty());
      System.out.println("getEntry() " + tree.getEntry(12359));
      System.out.println("contains() " + tree.contains(12359));
      System.out.println("remove() " + tree.remove(12359));
      System.out.println("contains() " + tree.contains(12359));
      System.out.println("inorderTraverse()");
      tree.inorderTraverse();
      System.out.println("preorderTraverse()");
      tree.preorderTraverse();
      System.out.println("postorderTraverse()");
      tree.postorderTraverse();
      
      for (int i = 0; i < treeData.length; i++){
         System.out.println("add() " + tree.add(treeData[i]));
      }
      
      System.out.println("isEmpty() " + tree.isEmpty());
      System.out.println("getEntry() " + tree.getEntry(12359));
      System.out.println("contains() " + tree.contains(12359));
      System.out.println("remove() " + tree.remove(12359));
      System.out.println("contains() " + tree.contains(12359));
      System.out.println("getEntry() " + tree.getEntry(67));
      System.out.println("contains() " + tree.contains(67));
      System.out.println("remove() " + tree.remove(67));
      System.out.println("contains() " + tree.contains(67));
      System.out.println("inorderTraverse()");
      tree.inorderTraverse();
      System.out.println("preorderTraverse()");
      tree.preorderTraverse();
      System.out.println("postorderTraverse()");
      tree.postorderTraverse();
   }

   public static int[] readFile(String path) throws IOException {
      
      String line;    
      
      FileReader file = new FileReader(path); 
         
      BufferedReader reader = new BufferedReader(file);
      
      line = reader.readLine();    
      reader.close();
      
      return Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();          
   } 
}