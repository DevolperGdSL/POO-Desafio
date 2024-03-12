package Aparelho;
import App.ReprodutordeMusica;
import utilidade.LeitoradeDados;

public class Iphone {
    public static void main(String[] args) {
        String escolha = " ";
        do {
            System.out.println("Selecione uma opção: ");
            System.out.println("1- Reprodutor de musica");
            System.out.println("2-Telefone");
            System.out.println("3-Navegador");
            System.out.println("4-Encerrar Iphone");
            escolha = LeitoradeDados.lerDado();
            switch (escolha) {
                case "1":
                    System.out.println("Entrando no reprodutor de musicas");
                    ReprodutordeMusica.menu();
                    break;
                case "2":

                    break;
                
                    

                case "3":
                    
                
                    break;
                case "4":



                    break;
                default:
                    break;
            }

        } while (escolha != "4");
        





    }
   
}
