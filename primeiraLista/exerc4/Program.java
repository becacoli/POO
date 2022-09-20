package exerc4;

import java.util.Scanner;

public class Program {
  static Scanner sc = new Scanner(System.in);
  
  static Color getColor(); {
      System.out.print("Color (BLACK/BLUE/RED): ");
      String colorFigure = sc.nextLine();
      switch (colorFigure) {
        case "RED":
            return Color.RED;        
        case "BLUE":
            return Color.BLUE;
        case "BLACK":
            return Color.BLACK;
        default:
            return null;
    }  
    
  }
}
