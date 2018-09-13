public class AdjacencyMatrix{

   public boolean[][] graph;
   
   public AdjacencyMatrix(){
      graph = new boolean[10][10];
   } 
   
   public AdjacencyMatrix(int size){
      graph = new boolean[size][size];
   } 
   
   public boolean addEdge(int firstVertex, int secondVertex){ 
      try {
         graph[firstVertex][secondVertex] = true;
      }
      catch (Exception e){
         return false;
      }
      return true;
   }
   
   public void printGraph(){
      boolean hasEdge = false;
      
      for (int i = 0; i < graph.length; i ++) {
         System.out.println("Vertex " + i + " is adjacent to:");
         for (int j = 0; j < graph[i].length; j++){
            if (graph[i][j] == true){
               System.out.println("  -> " + j);
               hasEdge = true;
            }
         }
         if (hasEdge == false)
            System.out.println("  -> no adjacent vertices");  
         System.out.println();
         hasEdge = false;
      }
   }  
   
   public static void main(String[] args){
      AdjacencyMatrix test = new AdjacencyMatrix();
      
      System.out.println(test.addEdge(5, 5));
      System.out.println(test.addEdge(55, 5));
      System.out.println(test.addEdge(5, 55));
      test.printGraph();
      System.out.println();

      AdjacencyMatrix matrix = new AdjacencyMatrix(9);
      
      matrix.addEdge(0, 1);
      matrix.addEdge(0, 3);
      matrix.addEdge(0, 4);
      
      matrix.addEdge(1, 4);
      
      matrix.addEdge(2, 1);
      
      matrix.addEdge(3, 6);
      
      matrix.addEdge(4, 5);
      matrix.addEdge(4, 7);
      
      matrix.addEdge(5, 2);
      matrix.addEdge(5, 7);
   
      matrix.addEdge(6, 7);
      
      matrix.addEdge(7, 8);
      
      matrix.addEdge(8, 5);
      
      matrix.printGraph();
   }

}