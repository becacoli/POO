package exerc4;

public class Circle extends Shape {
  private double radius;

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double area() {
    return Math.PI * Math.pow(radius, 2);
  }

}
