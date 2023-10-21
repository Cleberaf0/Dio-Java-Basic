package CentralAprovacaoPedidos.Aprovadores;

import CentralAprovacaoPedidos.Services.Aprovador;
import CentralAprovacaoPedidos.Services.Pedido;

public class Diretor extends Aprovador {

    @Override
    public void processarPedido(Pedido pedido) {
        if (pedido.getValor() <= 5000) {
            System.out.println("O diretor aprovou o pedido.");
        } else {
            proximo.processarPedido(pedido);
        }
    }
}