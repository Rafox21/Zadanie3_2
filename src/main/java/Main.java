// import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Scanner;
// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
  
    Scanner scanner = new Scanner(System.in);

    System.out.print("Wprowadź tekst: ");
    String tekst = scanner.nextLine();
    StringBuilder wynik = new StringBuilder();

    for (char znak : tekst.toCharArray()) {
        if (Character.isUpperCase(znak)) {
            wynik.append(Character.toLowerCase(znak));
        } else if (Character.isLowerCase(znak)) {
            wynik.append(Character.toUpperCase(znak));
        } else {
            wynik.append(znak);
        }
    }

    System.out.println("Tekst po zamianie: " + wynik);

    scanner.close();
    

      
      
    
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}