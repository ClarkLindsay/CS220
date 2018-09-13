abstract class Driver{

   public static void main(String[] args){
      Square square = new Square(4);
      Triangle triangle = new Triangle(2, 8);
      Circle circle = new Circle(4);
      Sphere sphere = new Sphere(4);
      Cube cube = new Cube(4);
      Tetrahedron tetrahedron = new Tetrahedron(4);
      
      Shape[] shapeArray = new Shape[6];
      shapeArray[0] = square;
      shapeArray[1] = triangle;
      shapeArray[2] = circle;
      shapeArray[3] = sphere;
      shapeArray[4] = cube;
      shapeArray[5] = tetrahedron;
      
      for (int i=0; i<6; i++){
         
         System.out.println(shapeArray[i].toString());
         
         System.out.println("");
      
         if(shapeArray[i] instanceof TwoDimensionalShape)
            System.out.println("The area of the " + shapeArray[i].getName() + " is: " + shapeArray[i].getArea());
         
         else{
            System.out.println("The area of the " + shapeArray[i].getName() + " is: " + shapeArray[i].getArea());
            
            System.out.println("");
            
            System.out.println("The volume of the " + shapeArray[i].getName() + " is: " + + shapeArray[i].getVolume());  
         }
            
         System.out.println("");
      }
   }
}