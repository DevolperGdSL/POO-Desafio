package App;

import Elementos.Musica;
import Negocio.MusicaNegocio;
import utilidade.LeitoradeDados;
import Aparelho.Iphone;
import BasedeDados.Banco;


public class ReprodutordeMusica {
    private static Banco banco = new Banco();

    private static MusicaNegocio musicaNegocio = new MusicaNegocio(banco);
    static String escolha;
    public static void menu(){
        do{
            System.out.println("Selecione uma opção: ");
            System.out.println("1- Cadastrar musica");
            System.out.println("2- Excluir musica");
            System.out.println("3- Selecionar musica");
            System.out.println("4- Pausar");
            System.out.println("5- Posterior");
            System.out.println("6- Anterior");
            System.out.println("7- Sair");
            escolha = LeitoradeDados.lerDado();
            switch (escolha) {
                case "1":
                    Musica musica = LeitoradeDados.lerMusica();
                    musicaNegocio.salvar(musica);
                    break;
                case "2":
                    System.out.println("Digite o nome da Musica");
                    String nomeMusica = LeitoradeDados.lerDado();
                    musicaNegocio.excluir(nomeMusica);
                    break;
                case "3":
                    
                    break;
                case "4":
                
                    break;
                case "5":
                
                    break;
                case "6":
                
                    break;
                case "7":
                    System.out.println("Saindo");
                    break;
                default:
                    break;
            }
        }while(escolha != "7");
    }
}

