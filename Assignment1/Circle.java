public final class Circle extends TwoDimensionalShape{

   private double radius;
   
   public Circle(double radius){
      this.radius = radius;
   }
   
   public double getArea(){
      return Math.PI*radius*radius;
   }
   
   public String toString(){
      return "A circle is defined as a round plane figure whose boundary (the circumference) consists of points equidistant from a fixed point (the center).";
   }
   
   public String getName(){
      return "circle";
   }
}