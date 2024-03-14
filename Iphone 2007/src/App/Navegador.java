package App;

import BasedeDados.Banco;
import Elementos.Aba;
import Negocio.NavegadorNegocio;
import utilidade.LeitoradeDados;
import utilidade.Lernum;

public class Navegador {
    private static Banco banco = new Banco();
    
    

    private static NavegadorNegocio navegadorNegocio = new NavegadorNegocio(banco);
    /**
     * Menu do Navegador
     */
    public static void menu(){
    int escolha = 0;
    /* 
     * Serve para os engraçadinhos de plantão que tentam procurar por coisas que não salvaram
     */
    boolean engraçadinho = true;
    do{
            System.out.println("Selecione uma opção: ");
            System.out.println("1- Abrir aba");
            System.out.println("2- Excluir aba");
            System.out.println("3- Selecionar aba");
            System.out.println("4- Sair");
            escolha = Lernum.lerNum();
            switch (escolha) {
                case 1:
                    Aba aba = LeitoradeDados.lerAba();  
                    navegadorNegocio.salvar(aba);                  
                    break;
                case 2:
                    System.out.println("Abas abertas:");
                    engraçadinho = navegadorNegocio.Listar();
                    if (engraçadinho) {
                        System.out.println("Digite o numero da Aba:");
                        int numeroAba = Lernum.lerNum();
                        navegadorNegocio.excluir(numeroAba);
                    }else{
                        System.out.println("Nenhuma");
                    }
                    
                    break;
                case 3:
                    System.out.println("Abas abertas:");
                    engraçadinho = navegadorNegocio.Listar();
                    if (engraçadinho) {
                        System.out.println("Digite o numero da Aba:");
                        int numeroAba = Lernum.lerNum();
                        navegadorNegocio.Selecionar(numeroAba);
                    }else{
                        System.out.println("Nenhuma");
                    }
                        
                    break;
                case 4:
                    System.out.println("Saindo");
                    break;
                default:
                    break;
            }
        }while(escolha != 4);
    }
}
