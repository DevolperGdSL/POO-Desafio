package Negocio;

import BasedeDados.Banco;
import Elementos.Aba;


public class NavegadorNegocio {
    private Banco bancoDados;

    public NavegadorNegocio(Banco banco){
        this.bancoDados = banco;
    }
    public void salvar(Aba aba) {

        boolean AbaRepetida = false;
        for (Aba site: bancoDados.getAbas()) {
            if (site.getEndereçodoSite().equals(aba.getEndereçodoSite())) {
                AbaRepetida = true;
                System.out.println("A aba já está aberta");
                break;
            }
        }

        if (!AbaRepetida) {
            this.bancoDados.adicionarAba(aba);
            System.out.println("Abrindo Aba");
        }
    }
        public void excluir(int codigo) {
            int i=codigo-1;
            bancoDados.removerAba(i);
            System.out.println("Aba Excluida");
       }
    
    public void Selecionar(int n){
        int j = 1;
        for(Aba site: bancoDados.getAbas()){
            if (j==n) {
                System.out.println("Abrindo Aba com o site de endereço: " + site.getEndereçodoSite());
            }
            j++;  
        }
    }
    public void Listar(){
        int i = 1;
        for(Aba site: bancoDados.getAbas()){
            System.out.println( i + " - " + site.getEndereçodoSite());
            i++;
        }
    }
}

