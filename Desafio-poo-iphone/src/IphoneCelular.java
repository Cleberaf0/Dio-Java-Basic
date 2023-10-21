public class IphoneCelular {

    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        Telefone telefone = new Telefone("11 99999-9999");
        Navegador navegador = new Navegador();

        musicPlayer.tocar();
        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreiroVoz();
        navegador.exibirPagina("https://www.google.com");
        musicPlayer.selecionarMusica(4);
        musicPlayer.pausar();
        musicPlayer.tocar();
        navegador.adicionarNovaAba();
        navegador.exibirPagina("https://www.dio.me");
    }
}