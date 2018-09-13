public final class Square extends TwoDimensionalShape{

   private double edge;

   public Square(double edge){
      this.edge = edge;
   }

   public final double getArea(){
      return edge * edge;
   }
   
   public String toString(){
      return "A square is defined as a plane figure with four equal straight sides and four right angles.";
   }
   
   public String getName(){
      return "square";
   }
}