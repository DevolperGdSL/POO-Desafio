package App;

import BasedeDados.Banco;
import Elementos.Contato;
import Negocio.TelefoneNegocio;
import utilidade.LeitoradeDados;
import utilidade.Lernum;

public class Telefone {
    private static Banco banco = new Banco();

    private static TelefoneNegocio telefoneNegocio = new TelefoneNegocio(banco);

    public static void menu(){
        int escolha = 0;
        do{
            System.out.println("Telefone");
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Selecionar contato");
            System.out.println("3 - Correio de Voz");
            System.out.println("4 - Sair");
            escolha = Lernum.lerNum();
            switch (escolha) {
                case 1:
                    Contato contato = LeitoradeDados.lerContato();
                    telefoneNegocio.salvar(contato);
                    break;
                case 2:
                    System.out.println("Lista de contatos:");
                    telefoneNegocio.Listar();
                    int contatoSelecionado = Lernum.lerNum();
                    telefoneNegocio.Selecionar(contatoSelecionado);
                    break;
                case 3:
                    telefoneNegocio.CorreiodeVoz();
                    break;
                case 4: 
                    System.out.println("Saindo...");
                    break;
                default:
                    break;
            }
        }while(escolha != 4);
    }
}
