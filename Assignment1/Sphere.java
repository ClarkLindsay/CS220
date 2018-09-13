public final class Sphere extends ThreeDimensionalShape{

   private double radius;
   
   public Sphere(double radius){
      this.radius = radius;
   }
   
   public double getArea(){
      return 4*Math.PI*radius*radius;
   }
   
   public double getVolume(){
      return (4.0/3.0)*Math.PI*Math.pow(radius, 3);
   }
   
   public String toString(){
      return "A sphere is defined as a round solid figure, or its surface, with every point on its surface equidistant from its center.";
   }
   
   public String getName(){
      return "sphere";
   }
}