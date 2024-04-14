package Graphics;
public class Rectangle {
 private double l;
 private double w;
 public Rectangle(double l, double w) {
 this.l = l;
 this.w = w;
 }
 public double calculateArea() {
 return this.l * this.w;
 }
}