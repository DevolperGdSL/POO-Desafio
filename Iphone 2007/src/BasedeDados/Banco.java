package BasedeDados;

import java.util.ArrayList;
import java.util.List;
import Elementos.Musica;
import Elementos.Aba;
import Elementos.Contato;

public class Banco {
    
    private List<Musica> musicas;

    private List<Contato> contatos;

    private List<Contato> correiodeVoz;

    private List<Aba> abas; 


    public Banco(){
        this.musicas = new ArrayList<>();
        this.contatos = new ArrayList<>();
        this.correiodeVoz = new ArrayList<>();
        this.abas = new ArrayList<>();
    }
    
    public Musica[] getMusicas(){
        return musicas.toArray(new Musica[musicas.size()]);
    }
    public void adicionarMusica(Musica musica){
        musicas.add(musica);
    }
    public void removerMusica(int posicao){
        musicas.remove(posicao);
    }

    public Contato[] getContatos(){
        return contatos.toArray(new Contato[contatos.size()]);
    }
    public void adicionarContato(Contato contato){
        contatos.add(contato);
    }
    public void removerContato(int posicao){
        contatos.remove(posicao);
    }
    
    public Contato[] getCorreiodeVoz(){
        return correiodeVoz.toArray(new Contato[correiodeVoz.size()]);
    }
    public void adicionarCoreio(Contato contato){
        contatos.add(contato);
    }
    public void removerCorreio(int posicao){
        contatos.remove(posicao);
    }

    public Aba[] getAbas(){
        return abas.toArray(new Aba[abas.size()]);
    }
    public void adicionarAba(Aba aba){
        abas.add(aba);
    }
    public void removerAba(int posicao){
        abas.remove(posicao);
    }
}
