package Negocio;

import BasedeDados.Banco;
import Elementos.Musica;

public class MusicaNegocio {

    private Banco bancoDados;

    public MusicaNegocio(Banco banco){
        this.bancoDados = banco;
    }
    public void salvar(Musica novaMusica) {

        boolean musicaRepitida = false;
        for (Musica musica: bancoDados.getMusicas()) {
            if (musica.getNome().equals(novaMusica.getNome())) {
                musicaRepitida = true;
                System.out.println("Musica já existe");
                break;
            }
        }

        if (!musicaRepitida) {
            this.bancoDados.adicionarMusica(novaMusica);
            System.out.println("Musica nova chegou");
        }
    }
    public void excluir(int codigo) {
            int i=codigo-1;
            bancoDados.removerMusica(i);
            System.out.println("Musica Excluida");
       }
    int tocando = 0;
    public void Selecionar(int n){
        int j = 1;
        for(Musica musica: bancoDados.getMusicas()){
            if (j==n) {
                tocando = j;
                System.out.println("Tocando musica: " + musica.getNome());
            }
            j++;  
        }
    }
    public void Listar(){
        int i = 1;
        for(Musica musica: bancoDados.getMusicas()){
            System.out.println( i + " - " + musica.getNome());
            i++;
        }
    }
    boolean situação = true;
    public void pause(boolean status){
        if (status == false) {
            System.out.println("Nada está tocando");
        }else{
            if (situação==true) {
                System.out.println("Musica pausada");
                situação = false;
            }else{
                System.out.println("Musica Despausada");
                situação = true;
            }
        }
    }

    public void posterior(){
        if(tocando==bancoDados.getMusicas().length){
            System.out.println("Você já está reproduzindo a ultima musica");
        }else{
            tocando++;
            Selecionar(tocando);
        }
    }
    public void anterior(){
        if(tocando==1){
            System.out.println("Você já está reproduzindo a primeira musica");
        }else{
            tocando--;
            Selecionar(tocando);
        }
    }

}
