package Negocio;

import BasedeDados.Banco;
import Elementos.Musica;

public class MusicaNegocio {

    private Banco bancoDados;

    public MusicaNegocio(Banco banco){
        this.bancoDados = banco;
    }
    public void salvar(Musica novaMusica) {

        boolean produtoRepetido = false;
        for (Musica produto: bancoDados.getMusicas()) {
            if (produto.getNome().equals(novaMusica.getNome())) {
                produtoRepetido = true;
                System.out.println("Produto já cadastrado.");
                break;
            }
        }

        if (!produtoRepetido) {
            this.bancoDados.adicionarMusica(novaMusica);
            System.out.println("Produto cadastrado com sucesso.");
        }
    }
    public void excluir(String codigo) {
        int i=0;
        for (Musica produto: bancoDados.getMusicas()) {
            if (produto.getNome().equals(codigo)) {
                bancoDados.removerMusica(i);
                System.out.println("Produto já cadastrado.");
                break;
            }
            i++;
        }
    }

}
