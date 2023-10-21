package CentralAprovaçãoPedidos.Services;

public class Pedido {

    private String type;
    private double valor;

    public Pedido(String type, double valor) {
        this.type = type;
        this.valor = valor;
    }

    public String getType() {
        return type;
    }

    public double getValor() {
        return valor;
    }
}