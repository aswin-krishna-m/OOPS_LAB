import Graphics.*;
public class TestGraphics {
 public static void main(String[] args) {
 
 Rectangle Rectangle = new Rectangle(4, 3);
 Triangle Triangle = new Triangle(3, 6);
 Square Square = new Square(4);
 Circle Circle = new Circle(2);
 System.out.println("Area of Rectangle: " + Rectangle.calculateArea());
 System.out.println("Area of Triangle: " + Triangle.calculateArea());
 System.out.println("Area of Square: " + Square.calculateArea());
 System.out.println("Area of Circle: "+Circle.calculateArea());
 }
}



// **************OUTPUT**************

/*

Area of Rectangle: 12.0
Area of Triangle: 9.0
Area of Square: 16.0
Area of Circle: 12.566370614359172

*/