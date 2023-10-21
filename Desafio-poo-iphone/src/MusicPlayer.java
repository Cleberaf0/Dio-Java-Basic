import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    private List<Musica> musicas;
    private int musicaAtual;

    public MusicPlayer() {
        musicas = new ArrayList<>();
        musicas.add(new Musica("Como Tudo Deve Ser", "Charlie Brown Junior"));
        musicas.add(new Musica("Promisses I Cant Keep", "Mike Shinoda"));
        musicas.add(new Musica("Uma Gota no Oceano", "NX0"));
        musicas.add(new Musica("Fighting Myself", "Linkin Park"));
        musicas.add(new Musica("Vem Ser Minha", "Charlie Brown Junior"));
        musicas.add(new Musica("Papercut","Linkin Park"));
    }

    public void tocar() {
        if (musicaAtual == -1) {
            musicaAtual = 0;
        }

        Musica musica = musicas.get(musicaAtual);
        musica.tocar();
    }

    public void pausar() {
        Musica musica = musicas.get(musicaAtual);
        musica.pausar();
    }

    public void selecionarMusica(int index) {
        musicaAtual = index;
        
        System.out.println("Música selecionada: " + musicas.get(musicaAtual).getNome() + " - " + musicas.get(musicaAtual).getArtista());
        
    }


}

class Musica  {

    private String nome;
    private String artista;

    public Musica(String nome, String artista) {
        this.nome = nome;
        this.artista = artista;
    }

    public String getArtista() {
        return artista;
    }

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void tocar() {
        System.out.println("Tocando música: " + nome + " - " + artista);
    }

    public void pausar() {
        System.out.println("Pausando música: " + nome + " - " + artista);
    }
    
}