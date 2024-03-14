package Negocio;

import BasedeDados.Banco;
import Elementos.Musica;

public class MusicaNegocio {

    private Banco bancoDados;

    public MusicaNegocio(Banco banco){
        this.bancoDados = banco;
    }
    /**
     * Verifica se existe outra musica de mesmo nome e Salva
     * @param novaMusica
     * do tipo musica
     */
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
    /**
     * Remove uma musica
     * @param codigo
     * do tipo inteiro
     */
    public void excluir(int codigo) {
            int i=codigo-1;
            bancoDados.removerMusica(i);
            System.out.println("Musica Excluida");
       }
    /**
     * Representa que musica está tocando
     */
    int tocando = 0;
    /**
     * Seleciona uma musica
     * @param n
     * do tipo inteiro
     */
    public void Selecionar(int n){
        int j = 1;
        for(Musica musica: bancoDados.getMusicas()){
            if (j==n) {
                tocando = j;
                System.out.println("Tocando musica: " + musica.getNome());
                situação = true;
            }
            j++;  
        }
    }
    /**
     * Lista todas as musicas
     * @return
     * boleano que diz se tem ou não musicas na lista
     */
    public boolean Listar(){
        boolean elementos = true;
        int i = 1;
        for(Musica musica: bancoDados.getMusicas()){
            System.out.println( i + " - " + musica.getNome());
            i++;
        }
        if (i==1) {
            elementos = false;
        }
        return elementos;
    }
    /**
     * Representa a musica estar pausada ou não
     */
    boolean situação = true;
    /**
     * Pausa
     */
    public void pause(){
        if (verifica()) {
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
    /**
     * Avança para proxima musica da lista
     */
    public void posterior(){
        if(verifica()) {
         System.out.println("Nada está tocando");
        }else{
            if(tocando==bancoDados.getMusicas().length){
                System.out.println("Você já está reproduzindo a ultima musica");
            }else{
                tocando++;
                Selecionar(tocando);
            }
        }
    }
    /**
     * Retorna para a musica anterior da lista
     */
    public void anterior(){
        if(verifica()){
            System.out.println("Nada está tocando");}
            else{
            if(tocando==1){
                System.out.println("Você já está reproduzindo a primeira musica");
            }else{
                tocando--;
                Selecionar(tocando);
            }
        }
    }
    /** 
     * Verifica se a musica está tocando
     */
    public boolean verifica(){
        boolean confirmação;
        if (tocando==0) {
            confirmação = true;
        }else{
            confirmação = false;
        }
        return confirmação;
    }
}
