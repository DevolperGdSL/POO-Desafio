package utilidade;

import java.util.Scanner;

import Elementos.Musica;

import BasedeDados.Banco;

public class LeitoradeDados {
    static int i = 0;

    public static Scanner scanner;

    static {
        scanner = new Scanner(System.in); 
    } 

    public static String lerDado(){
        String texto = scanner.nextLine();
        return texto;
    }
    Banco bancodeDados = new Banco();
    public static Musica lerMusica() {

		System.out.println("Cadastrando Musica...");
		Musica musica = new Musica();

		System.out.println("Digite o Nome: ");
		String nome = lerDado();
		musica.setNome(nome);
		return musica;
	}
    
    
}
