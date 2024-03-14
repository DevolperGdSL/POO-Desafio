package App;

import Elementos.Musica;
import Negocio.MusicaNegocio;
import utilidade.LeitoradeDados;
import utilidade.Lernum;
import BasedeDados.Banco;


public class ReprodutordeMusica {
    private static Banco banco = new Banco();

    private static MusicaNegocio musicaNegocio = new MusicaNegocio(banco);
    static int escolha;
    static boolean engraçadinho;
    /**
     * Menu do reprodutor de musica
     */
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
            escolha = Lernum.lerNum();
            switch (escolha) {
                case 1:
                    Musica musica = LeitoradeDados.lerMusica();
                    musicaNegocio.salvar(musica);
                    break;
                case 2:
                    System.out.println("Musicas cadastradas:");
                    engraçadinho = musicaNegocio.Listar();
                    if (engraçadinho) {
                        System.out.println("Digite o numero da Musica:");
                        int nomeMusica = Lernum.lerNum();
                        musicaNegocio.excluir(nomeMusica);
                    }else{
                        System.out.println("Nenhuma");
                    }
                    
                    break;
                case 3:
                    System.out.println("Musicas cadastradas:");
                    engraçadinho = musicaNegocio.Listar();
                    if (engraçadinho) {
                        System.out.println("Digite o numero da musica:");
                        int numeroMusica = Lernum.lerNum();
                        musicaNegocio.Selecionar(numeroMusica); 
                    }else{
                        System.out.println("Nenhuma");
                    }
                    
                    break;
                case 4:
                    musicaNegocio.pause();
                    break;
                case 5:
                    musicaNegocio.posterior();
                    break;
                case 6:
                    musicaNegocio.anterior();
                    break;
                case 7:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Entrada inválida tente novamente");
                    break;
            }
        }while(escolha != 7);
    }
}

