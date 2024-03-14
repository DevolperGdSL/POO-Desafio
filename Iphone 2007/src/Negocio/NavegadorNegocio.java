package Negocio;

import BasedeDados.Banco;
import Elementos.Aba;


public class NavegadorNegocio {
    private Banco bancoDados;

    public NavegadorNegocio(Banco banco){
        this.bancoDados = banco;
    }
    /**
     * Salva um tipo Aba
     * @param aba
     * do tipo Aba
     */
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
    /**
     * Remove uma Aba
     * @param codigo 
     * do tipo inteiro
     */
    public void excluir(int codigo) {
        int i=codigo-1;
        bancoDados.removerAba(i);
        System.out.println("Aba Excluida");
    }
    /**
     * Seleciona uma das abas abertas
     * @param n
     * do tipo inteiro
     */
    public void Selecionar(int n){
        int j = 1;
        for(Aba site: bancoDados.getAbas()){
            if (j==n) {
                System.out.println("Abrindo Aba com o site de endereço: " + site.getEndereçodoSite());
            }
            j++;  
        }
    }
    /**
     * Lista todas as abas abertas
     * @return
     * boleano que diz se tem ou não abas na lista
     */
    public boolean Listar(){
        boolean elementos = true;
        int i = 1;
        for(Aba site: bancoDados.getAbas()){
            System.out.println( i + " - " + site.getEndereçodoSite());
            i++;
        }
        if (i==1){
            elementos = false;
        }
        return elementos;
    }
}

