package Aparelho;
import App.Navegador;
import App.ReprodutordeMusica;
import App.Telefone;
import utilidade.Lernum;

public class Iphone {
    public static void main(String[] args) {
        int escolha = 0;
        do {
            System.out.println("Selecione uma opção: ");
            System.out.println("1-Reprodutor de musica");
            System.out.println("2-Telefone");
            System.out.println("3-Navegador");
            System.out.println("4-Encerrar Iphone");
            escolha = Lernum.lerNum();
            switch (escolha) {
                case 1:
                    System.out.println("Entrando no reprodutor de musicas");
                    ReprodutordeMusica.menu();
                    break;
                case 2:
                    System.out.println("Entrando no Telefone");
                    Telefone.menu();
                    break;
                case 3:
                    System.out.println("Entrando no Navegador");
                    Navegador.menu();
                    break;
                case 4:
                    System.out.println("Desligando...");
                    break;
                default:
                    break;
            }

        } while (escolha != 4);

    }
   
}
