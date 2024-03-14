package utilidade;

import java.util.Scanner;

public class Lernum {
    public static Scanner scanner;

    static {
        scanner = new Scanner(System.in); 
    } 
    /**
     * Faz a leitura de um inteiro
     * @return
     * Um numero do tipo inteiro
     */
    public static int lerNum(){
        int numero = scanner.nextInt();
        return numero;
    }
}
