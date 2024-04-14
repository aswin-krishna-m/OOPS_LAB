package Graphics;
public class Triangle {
 private double b,h;
 public Triangle(double b, double h) {
 this.b = b;
 this.h = h;
 }
 public double calculateArea() {
 return 0.5*this.b*this.h;
 }
}
