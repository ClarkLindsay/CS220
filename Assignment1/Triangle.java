public final class Triangle extends TwoDimensionalShape{
 
   
   private double base, heigth, hypotenuse; 

   public Triangle(double base, double heigth){
      this.base = base;
      this.heigth = heigth;
   }

   public final double getArea(){
      return (base * heigth) / 2;
   }
   
   public String toString(){
      return "A triangle is defined as a plane figure with three straight sides and three angles.";
   }
   
   public String getName(){
      return "triangle";
   }
}