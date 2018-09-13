public final class Tetrahedron extends ThreeDimensionalShape{

   private double edge;
   
   public Tetrahedron(double edge){
      this.edge = edge;
   }
   
   public double getArea(){
      return Math.sqrt(3)*edge*edge;
   }
   
   public double getVolume(){
      return (edge*edge*edge)/(6*Math.sqrt(2));
   }
   
   public String toString(){
      return "A tetrahedron is defined as a solid having four plane triangular faces; a triangular pyramid.";
   }
   
   public String getName(){
      return "tetrahedron";
   }
}