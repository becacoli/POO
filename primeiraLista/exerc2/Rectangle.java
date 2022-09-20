package exerc2;

public class Rectangle {
  double width, height;

  double area() {
    return width * height;
  }

  double perimeter() {
    return (width * height) * 2;
  }

  double diagonal() {
    return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));

  }
}
