package BasedeDados;

import java.util.ArrayList;
import java.util.List;
import Elementos.Musica;

public class Banco {
    
    private List<Musica> musicas;

    public Banco(){
        this.musicas = new ArrayList<>();

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

    
}
