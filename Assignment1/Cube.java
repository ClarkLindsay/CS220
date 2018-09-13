public final class Cube extends ThreeDimensionalShape{

   private double edge;
   
   public Cube(double edge){
      this.edge = edge;
   }
   
   public double getArea(){
      return 6*edge*edge;
   }
   
   public double getVolume(){
      return edge*edge*edge;
   }
   
   public String toString(){
      return "A cube is defined as a symmetrical three-dimensional shape, either solid or hollow, contained by six equal squares.";
   }
   
   public String getName(){
      return "cube";
   }
}