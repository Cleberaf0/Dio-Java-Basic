package CentralAprovacaoPedidos.Aprovadores;

import CentralAprovacaoPedidos.Services.Aprovador;
import CentralAprovacaoPedidos.Services.Pedido;

public class Presidente extends Aprovador {

    @Override
    public void processarPedido(Pedido pedido) {
        System.out.println("O presidente aprovou o pedido.");
    }
}