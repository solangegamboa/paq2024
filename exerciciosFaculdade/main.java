import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    try (Scanner teclado = new Scanner(System.in)) {
      System.out.println("Digite o seu nome:");
      String categoria = teclado.nextLine();
      System.out.println(categoria);
    }
  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }

}