import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    String name = "Quality Assurance Engineer";
    int space = 0, character = 0;

    int totalcharacter = name.length();
    for (int i=0; i < totalcharacter; i++) {
      char word = Character.toLowerCase(name.charAt(i));
      
      if (Character.isWhitespace(word)) {
        space++;
      }
    }
      
    System.out.println("Total Character Count: " + (name.length()-space));
  }
}
