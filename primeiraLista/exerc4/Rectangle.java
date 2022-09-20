package exerc4;

public class Rectangle extends Shape {
  private double width, height;

  public double getWidth() {
    return width;
  }

  public double getHeight() {
    return height;
  }

  // um método set não retornará nada, por isso usamos void
  public void setWidth(double width) {
    this.width = width;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double area() {
    return width * height;
  }
}
