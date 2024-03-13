package Negocio;

import BasedeDados.Banco;
import Elementos.Contato;
import utilidade.Lernum;

public class TelefoneNegocio {
    
    private Banco bancoDados;

    public TelefoneNegocio(Banco banco){
        this.bancoDados = banco;
    }
    public void salvar(Contato novoContato) {

        boolean contatoRepetido = false;
        for (Contato telefone: bancoDados.getContatos()) {
            if (telefone.getNome().equals(novoContato.getNome())) {
                contatoRepetido = true;
                System.out.println("Contato já cadastrado.");
                break;
            }
        }

        if (!contatoRepetido) {
            this.bancoDados.adicionarContato(novoContato);
            System.out.println("Contato cadastrado com sucesso.");
        }
    }
    
    public void Selecionar(int n){
        int j = 1;
        for(Contato telefone: bancoDados.getContatos()){
            if (j==n) {
                System.out.println("Ligando para: " + telefone.getNome() + "de numero: " + telefone.getNumero());
            }
            j++;  
        }
    }
    public void Listar(){
        int i = 1;
        for(Contato telefone: bancoDados.getContatos()){
            System.out.println( i + " - " + telefone.getNome());
            i++;
        }
    }
    public void CorreiodeVoz(){
        if (bancoDados.getCorreiodeVoz().length==0) {
            System.out.println("Correio de Voz Vazio");
        }else{
            int i = 1;
            for(Contato telefone: bancoDados.getCorreiodeVoz()){
                System.out.println( i + " - " + telefone.getNome());
                i++;
            }
            int ler = Lernum.lerNum();
            int j = 1;
            for(Contato telefone: bancoDados.getContatos()){
                if (j==ler) {
                    System.out.println("Ligando para: " + telefone.getNome() + "de numero: " + telefone.getNumero());
                }
                j++;  
            }
        }
    }
}
