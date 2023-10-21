package CentralAprovacaoPedidos.Services;

public abstract class Aprovador {

    protected Aprovador proximo;

    public void setProximo(Aprovador proximo) {
        this.proximo = proximo;
    }

    public abstract void processarPedido(Pedido pedido);

    public void setNext(Aprovador presidente) {
    }
}