package utilidade;

import java.util.Scanner;

public class Lernum {
    public static Scanner scanner;

    static {
        scanner = new Scanner(System.in); 
    } 

    public static int lerNum(){
        int numero = scanner.nextInt();
        return numero;
    }
}
