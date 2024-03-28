import java.util.Scanner;

public class exercicio25 {
  public static void main(String[] args) {
    // try (Scanner teclado = new Scanner(System.in)) {
    // System.out.println("Digite o seu nome:");
    // String categoria = teclado.nextLine();
    // System.out.println(categoria);
    // }
    /*
     * Implemente e execute o código de pesquisa linear dado em aula, incluindo
     * códigos para INTERROMPER a varredura completa do vetor, quando o
     * elemento procurado é encontrado
     */
    String[] vetorPalavras = new String[4];

    vetorPalavras[0] = "Teste";
    vetorPalavras[1] = "Amarelo";
    vetorPalavras[2] = "Laranja";
    vetorPalavras[3] = "Banana";
    //

    // for (int i; i < 4; i++) {

    // }
    // SEJA TRUE QUANDO FALSE PARA
    int contador = 0;
    boolean continuar = true;
    String palavraAchar = "Amarelo";
    while (continuar) {
      System.out.println(vetorPalavras[contador]);
      if (palavraAchar == vetorPalavras[contador]) {
        continuar = false;
        System.out.println("Achei a palavra: " + vetorPalavras[contador] + " -> " + palavraAchar);
      }
      contador = contador + 1;
    }

  }

}