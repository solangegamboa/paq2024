import java.util.Scanner;

public class main {
    /*
     * 
     * (Fazer como busca ativa!) Faça um algoritmo que leia uma matriz de ordem 3x3
     * de números inteiros. Após a leitura faça:
     * A - Calcule e mostre a soma dos elementos da primeira coluna;
     * B - Calcule e mostre a soma dos elementos de cada coluna;
     * C - Calcule e mostre o produto dos elementos da primeira linha;
     * D - Calcule e mostre a soma de todos os elementos da matriz;
     * E - Calcule e mostre a média dos elementos da matriz;
     * F - Calcule e mostre os elementos que são maiores que a média;
     * G - Calcule e mostre o maior elemento da matriz e sua posição;
     * H - Calcule e mostre o menor elemento da matriz e sua posição;
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // System.out.println(vetorPalavras[contador]);
        // Strings[] vetor = new String[4]; - vetor ou array
        int[][] matriz = new int[3][3];
        // System.out.println("Digite o seu nome:");
        // String categoria = teclado.nextLine();
        // System.out.println(categoria);

        // Preenchendo a matriz
        for (int primeiro = 0; primeiro < 3; primeiro++) {
            // 0 - 1
            for (int segundo = 0; segundo < 3; segundo++) {
                // 0 - 1 - 2
                System.out.println("Digite o elemento " + primeiro + "|" + segundo + " para a matriz primeiro: ");
                matriz[primeiro][segundo] = teclado.nextInt();
            }
        }

        int somaPrimeiraColuna = 0;
        int[] somaCadaColuna = new int[3];
        int somaDeTodos = 0;
        int media = 0;
        int maiorNumero = 0;
        int menorNumero = matriz[0][0];
        // Leitura
        for (int lerPrimeiro = 0; lerPrimeiro < 3; lerPrimeiro++) {

            for (int lerSegundo = 0; lerSegundo < 3; lerSegundo++) {

                // * A - Calcule e mostre a soma dos elementos da primeira coluna;
                if (lerPrimeiro < 1) {
                    somaPrimeiraColuna = somaPrimeiraColuna + matriz[lerPrimeiro][lerSegundo];
                }

                // B - Calcule e mostre a soma dos elementos de cada coluna;
                // Primeira entrada 0 e 0 => somaCadaColuna[0] = 0 + 1
                // Segunda entrada 0 e 1 => somaCadaColuna[0] = 1 + 2
                // Terceira entrada 0 e 2 => somaCadaColuna[0] = 3 + 5 - 8
                // Quarta entrada entrada 1 e 0 => somaCadaColuna[1] = 0 + 1
                // Quinta entrada entrada 1 e 1 => somaCadaColuna[1] = 1 + 15
                // Sexta entrada entrada 1 e 2 => somaCadaColuna[1] = 16 + 1 - 17
                somaCadaColuna[lerPrimeiro] = somaCadaColuna[lerPrimeiro] + matriz[lerPrimeiro][lerSegundo];

                // C - Calcule e mostre o produto dos elementos da primeira linha;

                // D - Calcule e mostre a soma de todos os elementos da matriz;
                somaDeTodos = somaDeTodos + matriz[lerPrimeiro][lerSegundo];

                // E - Calcule e mostre a média dos elementos da matriz;
                media = (somaDeTodos / 9);

                // G - Calcule e mostre o maior elemento da matriz e sua posição;
                if (matriz[lerPrimeiro][lerSegundo] > maiorNumero) {
                    maiorNumero = matriz[lerPrimeiro][lerSegundo];
                }

                // H - Calcule e mostre o menor elemento da matriz e sua posição;
                if (matriz[lerPrimeiro][lerSegundo] <= menorNumero) {
                    menorNumero = matriz[lerPrimeiro][lerSegundo];
                }

                // Leitura da matriz inteira
                System.out.println("Numero " + lerPrimeiro + "|" + lerSegundo + " :" + matriz[lerPrimeiro][lerSegundo]);
            }
        }

        System.out.println("somaPrimeiraColuna: " + somaPrimeiraColuna);

        for (int i = 0; i < 3; i++) {
            System.out.println("Leitura da coluna " + (i + 1) + ": " + somaCadaColuna[i]);
        }

        System.out.println("somaDeTodos: " + somaDeTodos);

        System.out.println("media: " + media);

        // F - Calcule e mostre os elementos que são maiores que a média;
        for (int lerPrimeiro = 0; lerPrimeiro < 3; lerPrimeiro++) {
            for (int lerSegundo = 0; lerSegundo < 3; lerSegundo++) {
                if (matriz[lerPrimeiro][lerSegundo] > media) {
                    System.out.println("maiores que a média: " + matriz[lerPrimeiro][lerSegundo]);
                }
            }
        }

        System.out.println("maiorNumero: " + maiorNumero);
        System.out.println("menorNumero: " + menorNumero);
    }
}
