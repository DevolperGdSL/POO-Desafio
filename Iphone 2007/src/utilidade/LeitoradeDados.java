package utilidade;

import java.util.Scanner;


import Elementos.Aba;
import Elementos.Contato;
import Elementos.Musica;


import BasedeDados.Banco;

public class LeitoradeDados {
    static int i = 0;

    public static Scanner scanner;

    static {
        scanner = new Scanner(System.in); 
    } 
    /**
     * Faz a leitura de um tipo texto
     * @return
     * Um tipo texto
     */
    public static String lerDado(){
        String texto = scanner.nextLine();
        return texto;
    }
    Banco bancodeDados = new Banco();
    /**
     * Faz a leitura de um tipo Musica
     * @return
     * Um tipo Musica
     */
    public static Musica lerMusica() {

		System.out.println("Cadastrando Musica...");
		Musica musica = new Musica();

		System.out.println("Digite o Nome: ");
		String nome = lerDado();
		musica.setNome(nome);
		return musica;
	}
    /**
     * Faz a leitura de um tipo Contato
     * @return
     * Um tipo Contato
     */
    public static Contato lerContato(){
        System.out.println("Cadastrando Contato...");
        Contato contato = new Contato();

        System.out.println("Digite o Nome do Contato:");
        String nome = lerDado();
        contato.setNome(nome);

        System.out.println("Digite o Numero do Contato:");
        int numero = Lernum.lerNum();
        contato.setNumero(numero);
        return contato;
    }
    /**
     * Faz a leitura de um tipo Aba
     * @return
     * Um tipo Aba
     */
    public static Aba lerAba(){
        Aba contato = new Aba();
        System.out.println("Digite o endereço do site:");
        String nome = lerDado();
        contato.setEndereçodoSite(nome);
        return contato;
    }
    
}
