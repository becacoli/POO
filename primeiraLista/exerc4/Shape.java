package exerc4;

public abstract class Shape {
  // terá cor/formato/area
   protected Color color;

  public Color getColor() {
      return color;
  }
  
  public void setColor(Color color) {
     this.color = color;
  }

  public double area(){
    return -1;
  }


}
