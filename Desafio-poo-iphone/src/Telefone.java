public class Telefone {

    private String numero;

    public Telefone(String numero) {
        this.numero = numero;
    }

    public void ligar() {
        System.out.println("Ligando para: " + numero);
    }

    public void atender() {
        System.out.println("Atendendo chamada de: " + numero);
    }

    public void iniciarCorreiroVoz() {
        System.out.println("Iniciando correio de voz");
    }
}