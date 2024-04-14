package Graphics;
public class Circle {
 private double r;
 public Circle(double r) {
 this.r = r;
 }
 public double calculateArea() {
 return Math.PI * this.r * this.r;
 }
}
